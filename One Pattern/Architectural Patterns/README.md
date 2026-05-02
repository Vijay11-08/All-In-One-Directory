
---

## 🌐 **Architectural & Enterprise Patterns**

**Purpose:** Patterns at **application or system** scale — how modules, layers, and services are organized (beyond single-class GoF patterns).

| Topic | Diagram + Python + Java |
| ----- | ------------------------ |
| MVC | [MVC](./MVC/README.md) |
| Repository | [Repository](./Repository/README.md) |

---

### **UI & presentation**

| Pattern | Intent |
| ------- | ------ |
| **MVC (Model–View–Controller)** | Separate data (Model), UI (View), and input/coordination (Controller). |
| **MVP (Model–View–Presenter)** | View is passive; Presenter handles logic and updates View. |
| **MVVM (Model–View–ViewModel)** | View binds to ViewModel; common in WPF, modern front-end frameworks. |
| **Flux / unidirectional data** | Single direction of state updates (actions → store → view). |

---

### **Data & domain**

| Pattern | Intent |
| ------- | ------ |
| **Repository** | Mediates between domain and data mapping; looks like an in-memory collection. |
| **Unit of Work** | Tracks changes to many objects and commits them as one transaction. |
| **Data Mapper** | Moves data between in-memory objects and DB while keeping them independent. |
| **CQRS** | Separate models for **commands** (writes) and **queries** (reads). |
| **Event Sourcing** | Store state as a sequence of events; rebuild state by replaying. |

---

### **Integration & messaging**

| Pattern | Intent |
| ------- | ------ |
| **API Gateway** | Single entry to many backend services; cross-cutting concerns in one place. |
| **Backend for Frontend (BFF)** | One backend tailored per client type (web vs mobile). |
| **Message Broker / Pub-Sub** | Decouple producers and consumers via asynchronous messages. |
| **Saga** | Manage distributed transactions as a sequence of local transactions with compensations. |

---

### **Dependency & composition**

| Pattern | Intent |
| ------- | ------ |
| **Dependency Injection (DI)** | Supply dependencies from outside instead of constructing inside classes. |
| **Service Locator** | Central registry resolves services (prefer DI for testability in many cases). |
| **Plugin / Module** | Load features as extensions behind stable interfaces. |

---

### **Distributed & resilience (often combined)**

| Pattern | Intent |
| ------- | ------ |
| **Microservices** | Small deployable services with bounded contexts. |
| **Circuit Breaker** | Stop calling failing dependencies; fail fast and recover later. |
| **Bulkhead** | Isolate resource pools so one failure doesn’t sink the whole system. |
| **Retry with backoff** | Repeat transient failures with increasing delays. |

---

## 📋 **How this relates to GoF**

* **GoF** patterns often apply **inside** a layer (e.g., Strategy inside a service).
* **Architectural** patterns describe **boundaries** between layers or services (e.g., Repository between domain and DB).

---

### **Minimal layering sketch**

```
[ Presentation ] → calls → [ Application / Use cases ]
                              ↓
[ Domain ] ← implemented by → [ Infrastructure (DB, HTTP, messaging) ]
```

Repository and DI typically sit at the boundary between **domain** and **infrastructure**.

---
