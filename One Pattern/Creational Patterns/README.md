
---

## 🏭 **Creational Patterns**

**Purpose:** Control **object creation** so the system stays flexible and does not depend on concrete classes everywhere.

| Pattern | Diagram + Python + Java |
| ------- | ------------------------ |
| Singleton | [Singleton](./Singleton/README.md) |
| Factory Method | [Factory Method](./Factory%20Method/README.md) |
| Abstract Factory | [Abstract Factory](./Abstract%20Factory/README.md) |
| Builder | [Builder](./Builder/README.md) |
| Prototype | [Prototype](./Prototype/README.md) |

---

### **1. Singleton**

* **Intent:** Ensure a class has **only one instance** and provide global access.
* **When:** Single shared resource (config, logger, connection pool).
* **Trade-off:** Global state; harder to test — use sparingly.

---

### **2. Factory Method**

* **Intent:** Define an interface for creating objects; let **subclasses** decide which class to instantiate.
* **When:** Creation logic varies by type or configuration.

---

### **3. Abstract Factory**

* **Intent:** Provide an interface for creating **families** of related objects without specifying concrete classes.
* **When:** UI themes, cross-platform toolkits, multiple compatible products.

---

### **4. Builder**

* **Intent:** Construct complex objects **step by step**; separate construction from representation.
* **When:** Many optional parameters or ordered setup (e.g., HTTP clients, query builders).

---

### **5. Prototype**

* **Intent:** Create new objects by **cloning** an existing instance instead of building from scratch.
* **When:** Object creation is costly; you need copies with small variations.

---

## 📋 **Summary table**

| Pattern | One-line idea |
| ------- | ------------- |
| Singleton | One instance for the whole app |
| Factory Method | Subclass chooses which product to create |
| Abstract Factory | Factory for whole families of related objects |
| Builder | Fluent / step-by-step assembly of complex objects |
| Prototype | Clone a template object |

---

### **Minimal examples (conceptual)**

**Singleton (concept):**

```java
public class Settings {
    private static Settings instance;
    private Settings() {}
    public static synchronized Settings getInstance() {
        if (instance == null) instance = new Settings();
        return instance;
    }
}
```

**Factory Method (concept):**

```java
abstract class Dialog {
    abstract Button createButton(); // factory method
    void render() {
        Button b = createButton();
        b.paint();
    }
}
```

---

## Explore more in this project

* [One Pattern hub](../README.md) — all categories  
* [Structural Patterns](../Structural%20Patterns/README.md) · [Behavioral Patterns](../Behavioral%20Patterns/README.md) · [Architectural Patterns](../Architectural%20Patterns/README.md) · [Star / number printing](../Star%20Number%20Patterns/README.md)

---
