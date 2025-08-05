package DesignPatterns.BehavioralDesignPatterns.ObserverPattern.StatePattern;

enum PauseState{
    PLAYING, PAUSE, STOPPED
}

class MediaPlayer{
    private PauseState state;

    public MediaPlayer(){
        this.state = PauseState.STOPPED;
    }
    
    public void pressPlay() {
        if (state.equals(PauseState.PLAYING)) {
            System.out.println("Pausing the media...");
            state = PauseState.PAUSE;
        } else if (state.equals(PauseState.PAUSE)) {
            System.out.println("Resuming the media...");
            state = PauseState.PLAYING;
        } else if (state.equals(PauseState.STOPPED)) {
            System.out.println("Starting the media...");
            state = PauseState.PLAYING;
        }
    }

    public void pressStop() {
        if (state.equals(PauseState.PLAYING) || state.equals(PauseState.PAUSE)) {
            System.out.println("Stopping the media...");
            state = PauseState.STOPPED;
        } else if (state.equals(PauseState.STOPPED)) {
            System.out.println("Media is already stopped.");
        }
    }

}

public class WithoutStatePattern {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.pressPlay();  // Starts playing
        player.pressPlay();  // Pauses
        player.pressPlay();  // Resumes
        player.pressStop();  // Stops
        player.pressStop();  // Already stopped

    }
}

// 🚫 Problems with this approach:
// Hard to extend: Adding a new state (e.g. FastForward) means changing every method.
// Violation of OCP: It violates the Open/Closed Principle — the code must be modified to support new states.
// Low cohesion: The MediaPlayer class handles both state management and actions, making it bloated.