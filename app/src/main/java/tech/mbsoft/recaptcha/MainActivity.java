package tech.mbsoft.recaptcha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

import tech.mbsoft.androidcaptcha.Captcha;
import tech.mbsoft.androidcaptcha.TextCaptcha;
import tech.mbsoft.recaptcha.sms_retriever.SMSListener;
import tech.mbsoft.recaptcha.sms_retriever.SMSReciever;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private static final String API_SITE_KEY = "6LfSCq4UAAAAAKcfmtMmL6FYSZAjX60qdRVwa1ns";

    Button btReCaptcha ,btValidateCaptcha;
    TextView tvCapthca;
    EditText etCaptchaAnswer,etSmsOtp;
    ImageView ivCaptchaImage;
    ImageButton btRefresh;
    LinearLayout llOtpBox;
    Captcha c;
    //Site Key : 6LfSCq4UAAAAAKcfmtMmL6FYSZAjX60qdRVwa1ns
    //Secret Key : 6LfSCq4UAAAAAHGNTaKSt9EN0pRJvanxiXXtU7i-


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        generateCaptcha();

        SMSReciever.bindListener(new SMSListener() {
            @Override
            public void messageReceived(String messageText) {
                llOtpBox.removeAllViews();
                etSmsOtp.setText(messageText);
                Log.e(TAG,messageText);
                for (int i=0;i<messageText.length();i++){
                    View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.single_otp_box,null);
                    EditText etOtpBox = view.findViewById(R.id.et_otp_box);
                    etOtpBox.setText(""+messageText.charAt(i));
                    llOtpBox.addView(view,new LinearLayout.LayoutParams(150, 150));
                }

            }
        });

    }

    private void initUI() {
        btReCaptcha = findViewById(R.id.btReCaptcha);
        btValidateCaptcha = findViewById(R.id.btValidateCaptcha);
        tvCapthca = findViewById(R.id.tvCaptcha);
        etCaptchaAnswer = findViewById(R.id.etCaptchaAnswer);
        ivCaptchaImage = findViewById(R.id.ivCaptchaImage);
        btRefresh = findViewById(R.id.btRefresh);
        etSmsOtp = findViewById(R.id.et_sms_otp);
        llOtpBox = findViewById(R.id.ll_et_box_otp);

        //bind click listener
        btRefresh.setOnClickListener(this);
        btValidateCaptcha.setOnClickListener(this);
        btReCaptcha.setOnClickListener(this);
    }

    private void generateCaptcha() {
        c = new TextCaptcha(300, 100, 5, TextCaptcha.TextOptions.NUMBERS_AND_LETTERS);
        ivCaptchaImage.setImageBitmap(c.getImage());
        // ivCaptchaImage.setLayoutParams(new LinearLayout.LayoutParams(c.width *2, c.height *2));
        tvCapthca.setText(c.answer);
        etCaptchaAnswer.setText("");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btRefresh:
                generateCaptcha();
                break;
            case R.id.btValidateCaptcha:
                if (c.checkAnswer(etCaptchaAnswer.getText().toString().trim())){
                    Toast.makeText(MainActivity.this, "Capthca validated !", Toast.LENGTH_SHORT).show();
                    generateCaptcha();
                }else {
                    Toast.makeText(MainActivity.this, "Capthca not validated !", Toast.LENGTH_SHORT).show();
                    generateCaptcha();
                }
                break;
            case R.id.btReCaptcha:
                SafetyNet.getClient(MainActivity.this).verifyWithRecaptcha(API_SITE_KEY)
                        .addOnSuccessListener(
                                new OnSuccessListener<SafetyNetApi.RecaptchaTokenResponse>() {
                                    @Override
                                    public void onSuccess(SafetyNetApi.RecaptchaTokenResponse response) {
                                        // Indicates communication with reCAPTCHA service was
                                        // successful.
                                        String userResponseToken = response.getTokenResult();
                                        if (!userResponseToken.isEmpty()) {
                                            // Validate the user response token using the
                                            // reCAPTCHA siteverify API.
                                            Log.e(TAG,"Success "+userResponseToken);
                                        }
                                    }
                                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                if (e instanceof ApiException) {
                                    // An error occurred when communicating with the
                                    // reCAPTCHA service. Refer to the status code to
                                    // handle the error appropriately.
                                    ApiException apiException = (ApiException) e;
                                    int statusCode = apiException.getStatusCode();
                                    Log.d(TAG, "Error: " + CommonStatusCodes
                                            .getStatusCodeString(statusCode));
                                } else {
                                    // A different, unknown type of error occurred.
                                    Log.d(TAG, "Error: " + e.getMessage());
                                }
                            }
                        });
                break;
        }
    }
}
