You’re designing a media player. The player can be in one of the following states:
Playing
Paused
Stopped

Each state determines what happens when a user presses the Play or Stop button:
If playing: Play pauses, Stop stops.
If paused: Play resumes, Stop stops.
If stopped: Play starts playing, Stop does nothing.

🧠 Benefits of Using the State Pattern
✅ Open/Closed Principle: Add new states without modifying existing ones.
✅ Separation of Concerns: Each state handles its own behavior.
✅ Scalable and Maintainable: Easy to extend and debug.

Difference b/w state and strategy patterns -
Strategy and State patterns are structurally similar, sometimes nearly identical in implementation.
But here’s the key:
✅ They differ in intent and how they're used, not necessarily in how they look.
🔍 Why They Feel Similar
Both:
Use composition (an object holds a reference to another object implementing an interface).
Allow behavior to change at runtime via polymorphism.
Define a common interface for interchangeable classes (strategies or states).
This leads to very similar class diagrams. For example:
[Context] --> [StrategyInterface or StateInterface]
                          ↑
       [ConcreteStrategy1]  [ConcreteStrategy2]
| Feature              | **Strategy Pattern**                                     | **State Pattern**                                         |
| -------------------- | -------------------------------------------------------- | --------------------------------------------------------- |
| **Purpose**          | Choose among *algorithms* dynamically                    | Represent *stateful behavior* changing over time          |
| **Change Trigger**   | The client chooses the strategy manually                 | The context (object) changes its state internally         |
| **Object Role**      | Strategy is **plugged in** by the user                   | State is **driven by internal transitions**               |
| **Example**          | Sort using `QuickSort` or `MergeSort`, chosen externally | Media player transitions from `Playing` to `Paused` state |
| **Behavior Control** | Controlled externally by the client                      | Controlled internally by the object itself                |
🧪 Analogy to Clarify:
Strategy Pattern:
→ You choose a tool from a toolbox to do a job.
→ "I want to compress files using ZIP or RAR — I decide."

State Pattern:
→ The object behaves differently based on its mood or internal status.
→ "A person behaves differently when happy vs. angry — the person doesn’t ask you which mood to use."
