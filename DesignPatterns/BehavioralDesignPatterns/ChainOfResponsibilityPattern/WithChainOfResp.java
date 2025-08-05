package DesignPatterns.BehavioralDesignPatterns.ChainOfResponsibilityPattern;

// Abstract handler class for support requests
// Step 1: Create an Abstract Support Handler
abstract class SupportHandlerII {
    public static final int LEVEL_ONE = 1;
    public static final int LEVEL_TWO = 2;
    public static final int LEVEL_THREE = 3;
    public static final int LEVEL_FOUR = 4;

    protected int level;
    protected SupportHandlerII nextHandler;

    // Set the next handler in the chain
    public void setNextHandler(SupportHandlerII nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Handle request or pass it along
    public void handleRequest(int level, String message) {
        if (this.level == level) {
            respond(message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        } else {
            System.out.println("No handler available for this request: " + message);
        }
    }

    // To be implemented by concrete handlers
    protected abstract void respond(String message);
}

// Step 2: Create Concrete Handlers
// Handles general inquiries (Level 1)
class SupportExecutive extends SupportHandlerII {
    public SupportExecutive() {
        this.level = LEVEL_ONE;
    }

    @Override
    protected void respond(String message) {
        System.out.println("Support Executive handling: " + message);
    }
}

// Handles billing issues (Level 2)
class SupportManager extends SupportHandlerII {
    public SupportManager() {
        this.level = LEVEL_TWO;
    }

    @Override
    protected void respond(String message) {
        System.out.println("Support Manager handling: " + message);
    }
}

// Handles technical problems (Level 3)
class TechnicalTeam extends SupportHandlerII {
    public TechnicalTeam() {
        this.level = LEVEL_THREE;
    }

    @Override
    protected void respond(String message) {
        System.out.println("Technical Team handling: " + message);
    }
}

// Handles legal issues (Level 4)
class LegalDepartment extends SupportHandlerII {
    public LegalDepartment() {
        this.level = LEVEL_FOUR;
    }

    @Override
    protected void respond(String message) {
        System.out.println("Legal Department handling: " + message);
    }
}

// Builds and tests the chain of support handlers
public class WithChainOfResp {
    public static SupportHandlerII setupSupportChain() {
        SupportHandlerII executive = new SupportExecutive();
        SupportHandlerII manager = new SupportManager();
        SupportHandlerII tech = new TechnicalTeam();
        SupportHandlerII legal = new LegalDepartment();

        // Set the chain: Executive -> Manager -> Tech -> Legal
        executive.setNextHandler(manager);
        manager.setNextHandler(tech);
        tech.setNextHandler(legal);

        return executive;
    }

    public static void main(String[] args) {
        SupportHandlerII supportChain = setupSupportChain();

        supportChain.handleRequest(1, "What are your office hours?");
        supportChain.handleRequest(2, "There is a problem with my billing.");
        supportChain.handleRequest(3, "System crashed while updating.");
        supportChain.handleRequest(4, "I need to review a contract.");
        supportChain.handleRequest(5, "This is an unknown issue.");
    }
}

// | Advantage                   | Description                                                           |
// | --------------------------- | --------------------------------------------------------------------- |
// | 🔄 **Flexible Flow**        | Easily reconfigure the chain (e.g., Manager -> Executive -> Legal)    |
// | 📦 **Encapsulation**        | Each handler encapsulates its logic                                   |
// | ➕ **Easily Extensible**     | Add new handler (e.g., `HRDepartment`) without changing existing code |
// | 🔍 **Clear Responsibility** | Each class has a single purpose (SRP)                                 |


