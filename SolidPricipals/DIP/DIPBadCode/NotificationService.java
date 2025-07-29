package SolidPricipals.DIP.DIPBadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }

    public void notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }
}

// Problems - 
// Tight coupling - Lets say if the method in emailService is changes, changes need to made here as well
// Less Flexible - If a new service needs to be added, this class needs to modified as well.
// Difficult Testing as this NotificationService is dependent upon specific implemntations of other services. So this class cannot be isolated
// and tested directly.
// Violates DIP
