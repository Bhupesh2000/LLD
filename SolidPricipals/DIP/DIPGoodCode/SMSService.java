package SolidPricipals.DIP.DIPGoodCode;

public class SMSService implements NotificationChannel{
    
    @Override
    public void sendMsg(String msg){
        System.out.println("Sending SMS : " + msg);
    }
}
