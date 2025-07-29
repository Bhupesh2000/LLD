package SolidPricipals.DIP.DIPGoodCode;

// Now this notification service will not directly depend upon the low level services.
// Rather it will depend upon abstraction called NotificationChannel.
// This NotificationChannel is going to be an interface
// All the low level services are going to implement this interface
public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel){
        this.notificationChannel = notificationChannel;
    }

    public void sendMsg(String msg){
        notificationChannel.sendMsg(msg);
    }
}
