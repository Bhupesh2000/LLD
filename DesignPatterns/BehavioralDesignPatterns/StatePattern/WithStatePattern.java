package DesignPatterns.BehavioralDesignPatterns.StatePattern;

// Common interface for all states
interface State {
    void pressPlay(MediaPlayerII context);
    void pressStop(MediaPlayerII context);
}

// Playing state implementation
class PlayingState implements State {
    @Override
    public void pressPlay(MediaPlayerII context) {
        System.out.println("Pausing the media...");
        context.setState(new PausedState());
    }

    @Override
    public void pressStop(MediaPlayerII context) {
        System.out.println("Stopping the media...");
        context.setState(new StoppedState());
    }
}

// Paused state implementation
class PausedState implements State {
    @Override
    public void pressPlay(MediaPlayerII context) {
        System.out.println("Resuming the media...");
        context.setState(new PlayingState());
    }

    @Override
    public void pressStop(MediaPlayerII context) {
        System.out.println("Stopping the media...");
        context.setState(new StoppedState());
    }
}

// Stopped state implementation
class StoppedState implements State {
    @Override
    public void pressPlay(MediaPlayerII context) {
        System.out.println("Starting the media...");
        context.setState(new PlayingState());
    }

    @Override
    public void pressStop(MediaPlayerII context) {
        System.out.println("Media is already stopped.");
    }
}

// Context class that delegates behavior to current state
class MediaPlayerII {

    private State state;

    public MediaPlayerII() {
        // Initial state is STOPPED
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this);
    }

    public void pressStop() {
        state.pressStop(this);
    }
}


public class WithStatePattern {
    public static void main(String[] args) {
        MediaPlayerII player = new MediaPlayerII();

        player.pressPlay();  // Starts playing
        player.pressPlay();  // Pauses
        player.pressPlay();  // Resumes
        player.pressStop();  // Stops
        player.pressStop();  // Already stopped
    }
}
