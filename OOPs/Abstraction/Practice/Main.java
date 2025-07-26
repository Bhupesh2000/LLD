package OOPs.Abstraction.Practice;

public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent EventOne = new PasswordChangeEvent("12345");
        MissedPaymentEvent EventTwo = new MissedPaymentEvent("54311");

        Event [] events = {EventOne, EventTwo};

        for(Event e : events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
