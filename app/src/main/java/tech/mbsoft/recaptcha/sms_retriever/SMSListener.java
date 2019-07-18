package tech.mbsoft.recaptcha.sms_retriever;

public interface SMSListener {
     void messageReceived(String messageText);
}
