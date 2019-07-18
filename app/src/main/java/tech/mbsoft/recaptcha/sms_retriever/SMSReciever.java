package tech.mbsoft.recaptcha.sms_retriever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMSReciever extends BroadcastReceiver {
    private static final String TAG = "SMSReciever";
    private static SMSListener smsListener;

    String codeOtp,smsSender;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle data  = intent.getExtras();
        Object[] pdus = (Object[]) data.get("pdus");
        for(int i=0;i<pdus.length;i++){
            SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdus[i]);
            smsSender = smsMessage.getDisplayOriginatingAddress();
            String messageBody = smsMessage.getMessageBody();
            Log.e(TAG,""+messageBody +" Sender: "+smsSender);

            codeOtp =messageBody.replaceAll("[^0-9]","");
            Log.e(TAG,"\n"+ codeOtp);
            //Pass on the text to our listener.
            smsListener.messageReceived(codeOtp);

        }
    }
    public static void bindListener(SMSListener listener) {

        smsListener = listener;
    }
}
