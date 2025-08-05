The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects, so that when one object (the Subject) changes its state, all its dependents (Observers) are notified automatically and updated.

🔁 Real-World Analogy
Imagine a news agency (subject) and a bunch of subscribers (observers):
When the agency publishes a news article,
All the subscribers are notified automatically (e.g., email, mobile app, website).
You don’t want the agency to hard-code how it updates each subscriber — that would be messy. Instead, the subscribers register themselves, and the agency just calls “notify” — it doesn’t care who is listening.

| Term         | Description                                                               |
| ------------ | ------------------------------------------------------------------------- |
| **Subject**  | The object being observed (e.g., NewsAgency)                              |
| **Observer** | An object that wants to be notified when the subject changes              |
| **Register** | Observers sign up to listen for updates                                   |
| **Notify**   | The subject calls a method on all registered observers when state changes |

✅ Use Cases
GUI Toolkits (e.g., button click listeners)
Real-time Notifications (news, weather alerts)
MVC Architecture (Model updates View via observers)
Event systems (game development, messaging)

The Observer Pattern lets you define a publisher-subscriber relationship where objects (observers) are automatically notified and updated when another object (the subject) changes its state — without tightly coupling them.