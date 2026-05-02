
---

## 🏗️ **Structural Patterns**

**Purpose:** Explain how **classes and objects are composed** to form larger structures while keeping those structures flexible and efficient.

| Pattern | Diagram + Python + Java |
| ------- | ------------------------ |
| Adapter | [Adapter](./Adapter/README.md) |
| Bridge | [Bridge](./Bridge/README.md) |
| Composite | [Composite](./Composite/README.md) |
| Decorator | [Decorator](./Decorator/README.md) |
| Facade | [Facade](./Facade/README.md) |
| Flyweight | [Flyweight](./Flyweight/README.md) |
| Proxy | [Proxy](./Proxy/README.md) |

---

### **1. Adapter**

* **Intent:** Convert one interface into another so **incompatible types work together**.
* **When:** Wrapping legacy APIs, third-party SDKs, or bridging two libraries.

---

### **2. Bridge**

* **Intent:** Split a large class into **abstraction** and **implementation** so they can evolve independently.
* **When:** Multiple dimensions of variation (e.g., shapes × rendering backends).

---

### **3. Composite**

* **Intent:** Treat **individual objects and compositions** uniformly (tree structures).
* **When:** UI components, file systems, org charts — “part-whole” hierarchies.

---

### **4. Decorator**

* **Intent:** Add behavior to objects **dynamically** by wrapping them, without subclass explosion.
* **When:** Middleware, stream wrappers, optional features stacked at runtime.

---

### **5. Facade**

* **Intent:** Provide a **simple interface** to a complex subsystem.
* **When:** Hiding many services behind one API for clients.

---

### **6. Flyweight**

* **Intent:** Share **intrinsic state** across many similar objects to save memory.
* **When:** Large numbers of lightweight objects (text glyphs, map tiles).

---

### **7. Proxy**

* **Intent:** Provide a **surrogate** that controls access to another object.
* **When:** Lazy loading, access control, logging, remote stubs.

---

## 📋 **Summary table**

| Pattern | One-line idea |
| ------- | ------------- |
| Adapter | Makes two interfaces compatible |
| Bridge | Separates abstraction from implementation |
| Composite | Tree of objects treated uniformly |
| Decorator | Stack behaviors by wrapping |
| Facade | One simple entry to a complex system |
| Flyweight | Share immutable parts to save memory |
| Proxy | Stand-in that controls or augments access |

---

### **Minimal example — Adapter**

```typescript
// Existing class with incompatible interface
class LegacyPrinter {
  oldPrint(msg: string) { console.log(msg); }
}

// Target interface your app expects
interface Printer {
  printDocument(text: string): void;
}

class PrinterAdapter implements Printer {
  constructor(private legacy: LegacyPrinter) {}
  printDocument(text: string) {
    this.legacy.oldPrint(text);
  }
}
```

---
