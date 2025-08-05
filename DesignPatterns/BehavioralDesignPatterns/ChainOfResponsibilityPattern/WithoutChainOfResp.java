package DesignPatterns.BehavioralDesignPatterns.ChainOfResponsibilityPattern;

// Basic support handler without using a chain
class SupportHandler {
    public void handleRequest(int level, String message) {
        if (level == 1) {
            System.out.println("Support Executive handling: " + message);
        } else if (level == 2) {
            System.out.println("Support Manager handling: " + message);
        } else if (level == 3) {
            System.out.println("Technical Team handling: " + message);
        } else if (level == 4) {
            System.out.println("Legal Department handling: " + message);
        } else {
            System.out.println("Unknown support level: " + message);
        }
    }
}


public class WithoutChainOfResp {
    public static void main(String[] args) {
        SupportHandler handler = new SupportHandler();

        handler.handleRequest(1, "I want to ask about your services.");
        handler.handleRequest(3, "My internet is down.");
        handler.handleRequest(4, "I need help with legal documents.");
    }
}

// ⚠ Problems with This Code
// Hardcoded logic – All levels and logic are embedded in one class.
// Not scalable – Adding new support levels requires changing SupportHandler.
// Breaks OOP principles – No separation of responsibilities.

