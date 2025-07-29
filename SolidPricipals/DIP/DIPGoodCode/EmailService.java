package SolidPricipals.DIP.DIPGoodCode;

public class EmailService implements NotificationChannel{
    
    @Override
    public void sendMsg(String msg){
        System.out.println("Sending Email: " + msg);
    }
}
