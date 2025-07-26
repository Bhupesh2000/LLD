package OOPs.Abstraction.Interface;

// Any class that want to use Event interface must implement the mentioned methods
public interface Event {
    Long getTimeStamp();
    void process();
}
