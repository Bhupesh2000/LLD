package SolidPricipals.DIP.DIPGoodCode;

public class Main {
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.sendMsg("Your order has been shipped");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.sendMsg("The OTP is 1234");

    }
}
