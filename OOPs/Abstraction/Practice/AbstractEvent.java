package OOPs.Abstraction.Practice;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {
    protected final Long createdTimeStamp;
    protected final String id;

    public AbstractEvent(String id){
        this.id = id;
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp(){
        return this.createdTimeStamp;
    }

    public abstract void process();
}
