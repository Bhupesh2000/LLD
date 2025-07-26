package OOPs.Abstraction.Practice;

public class PasswordChangeEvent extends AbstractEvent{
    public PasswordChangeEvent(String id){
        super(id);
    }

    @Override
    public void process(){
        System.out.println("Customer " + this.id + " changed their password. Sending confirmation email");
    }
}
