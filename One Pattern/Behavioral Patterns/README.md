
---

## 🎭 **Behavioral Patterns**

**Purpose:** Define **how objects communicate**, assign responsibilities, and encapsulate algorithms or workflows.

| Pattern | Diagram + Python + Java |
| ------- | ------------------------ |
| Chain of Responsibility | [Chain of Responsibility](./Chain%20of%20Responsibility/README.md) |
| Command | [Command](./Command/README.md) |
| Interpreter | [Interpreter](./Interpreter/README.md) |
| Iterator | [Iterator](./Iterator/README.md) |
| Mediator | [Mediator](./Mediator/README.md) |
| Memento | [Memento](./Memento/README.md) |
| Observer | [Observer](./Observer/README.md) |
| State | [State](./State/README.md) |
| Strategy | [Strategy](./Strategy/README.md) |
| Template Method | [Template Method](./Template%20Method/README.md) |
| Visitor | [Visitor](./Visitor/README.md) |

---

### **1. Chain of Responsibility**

* **Intent:** Pass a request along a **chain** of handlers until one handles it.
* **When:** Middleware pipelines, approval workflows, event bubbling.

---

### **2. Command**

* **Intent:** Encapsulate a request as an **object** so you can queue, log, undo, or schedule operations.
* **When:** Undo/redo, macro recording, job queues.

---

### **3. Interpreter**

* **Intent:** Define grammar for a language and an interpreter to evaluate sentences.
* **When:** Small domain-specific languages, rule engines, expression evaluators.

---

### **4. Iterator**

* **Intent:** Access elements of a collection **sequentially** without exposing internal structure.
* **When:** Custom collections, pagination abstractions.

---

### **5. Mediator**

* **Intent:** Objects talk through a **mediator** instead of referencing each other directly.
* **When:** Complex UI dialogs, chat rooms, reducing coupling between many peers.

---

### **6. Memento**

* **Intent:** Capture and restore object **state** without breaking encapsulation.
* **When:** Undo snapshots, save games, versioned edits.

---

### **7. Observer**

* **Intent:** One-to-many dependency: when one object changes, **dependents are notified**.
* **When:** Pub/sub, reactive UI, event buses.

---

### **8. State**

* **Intent:** Let an object alter behavior when its **internal state** changes (like substituting the whole object behavior).
* **When:** Finite state machines, connection states, game AI modes.

---

### **9. Strategy**

* **Intent:** Define a family of **interchangeable algorithms** and make them swappable.
* **When:** Payment providers, sorting policies, pricing rules.

---

### **10. Template Method**

* **Intent:** Define the **skeleton** of an algorithm in a base class; subclasses fill in steps.
* **When:** Shared workflow with customizable steps (ETL pipelines, test fixtures).

---

### **11. Visitor**

* **Intent:** Separate **operations** from object structure; add new operations without changing every element class.
* **When:** AST traversal, document export to many formats.

---

## 📋 **Summary table**

| Pattern | One-line idea |
| ------- | ------------- |
| Chain of Responsibility | Handlers in sequence until one deals with it |
| Command | Request as an object (undo/queue/log) |
| Interpreter | Parse and evaluate a mini-language |
| Iterator | Traverse a collection safely |
| Mediator | Central hub reduces peer-to-peer coupling |
| Memento | Save/restore state snapshots |
| Observer | Notify many listeners of changes |
| State | Behavior changes with internal state |
| Strategy | Plug in different algorithms |
| Template Method | Fixed outline, customizable steps |
| Visitor | New operations over a stable object structure |

---

### **Minimal example — Strategy**

```typescript
interface SortStrategy {
  sort(data: number[]): number[];
}

class QuickSort implements SortStrategy {
  sort(data: number[]) { /* ... */ return [...data].sort((a,b)=>a-b); }
}

class Context {
  constructor(private strategy: SortStrategy) {}
  setStrategy(s: SortStrategy) { this.strategy = s; }
  runSort(data: number[]) { return this.strategy.sort(data); }
}
```

---

## Explore more in this project

* [One Pattern hub](../README.md) — all categories  
* [Creational Patterns](../Creational%20Patterns/README.md) · [Structural Patterns](../Structural%20Patterns/README.md) · [Architectural Patterns](../Architectural%20Patterns/README.md) · [Star / number printing](../Star%20Number%20Patterns/README.md)

---
