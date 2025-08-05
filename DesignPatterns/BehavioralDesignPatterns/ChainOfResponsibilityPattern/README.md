The Chain of Responsibility (CoR) is a behavioral design pattern that lets you pass requests along a chain of handlers. Each handler can choose to:
Process the request
OR pass it to the next handler in the chain
This helps decouple the sender of the request from the object that handles it.

🔁 Real-World Analogy
Think of customer support escalation:
A basic agent tries to resolve your issue.
If they can't, they escalate to a supervisor.
If the supervisor can't, it goes to a manager.
And so on...
This is a chain where each handler has a chance to respond, and can pass the request onward if it can't.

Intent - Avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.

+------------------+       +------------------+       +------------------+
| Handler (abstract)|----->| ConcreteHandler1 |-----> | ConcreteHandler2 |-----> ...
+------------------+       +------------------+       +------------------+
| +setNext()        |       | +handle()        |       | +handle()        |
| +handle()         |       +------------------+       +------------------+
+------------------+

Each handler holds a reference to the next handler and decides whether to handle or forward.

You're building a customer support system. Customers can submit issues of varying severity:
Level 1: General Inquiry
Level 2: Billing Issue
Level 3: Technical Problem
Level 4: Legal Issue
Your company has a support hierarchy:
Support Executive handles Level 1.
Support Manager handles Level 2 and escalated issues.
Technical Team handles Level 3 and above.
Legal Department handles Level 4 only.


🧠 Benefits
✅ Decouples sender from handler.
✅ Adds flexibility in assigning responsibilities.
✅ Can change chain at runtime.
✅ Avoids monolithic if-else chains.

🚫 Drawbacks
❌ May lead to unhandled requests.
❌ Debugging can be harder if chain gets long or unclear.