package OOPs.Abstraction.Interface;

import java.sql.Timestamp;

public class MissedPaymentEvent implements Event{
    
    private final Long createdTimeStamp;
    private final String id;

    public MissedPaymentEvent(String id){
        this.id = id;
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp(){
        return createdTimeStamp;
    }

    @Override
    public void process(){
        System.out.println("Customer " + id + " missed their payment. Sending a bill to the customer");
    }
}
