
---

## One Pattern — patterns hub

This folder collects **three kinds of patterns**, each in its own subfolders:

| Kind | What it is | Where |
| ---- | ---------- | ----- |
| **GoF (Gang of Four)** | Object-oriented design patterns | [Creational](./Creational%20Patterns/README.md), [Structural](./Structural%20Patterns/README.md), [Behavioral](./Behavioral%20Patterns/README.md) |
| **Architectural & enterprise** | App layout, UI separation, data access, DI | [Architectural Patterns](./Architectural%20Patterns/README.md) |
| **Star / number printing** | Console `*` and number shapes (25-chart style) | [Star Number Patterns](./Star%20Number%20Patterns/README.md) |

---

## Folder map

```text
One Pattern/
├── README.md                    ← you are here
├── Creational Patterns/         ← 5 patterns, each with README + diagram + Python + Java
├── Structural Patterns/         ← 7 patterns
├── Behavioral Patterns/         ← 11 patterns
├── Architectural Patterns/      ← MVC, MVP, MVVM, DI, Repository, + topic tables
└── Star Number Patterns/        ← print_patterns.py, PrintPatterns.java, 25 subfolders
```

---

## GoF — diagram + Python + Java

Every GoF pattern has its **own folder** and **README** with a **Mermaid** structure diagram and **Python** and **Java** examples.

### Creational

| Pattern | Folder |
| ------- | ------ |
| Singleton | [Singleton](./Creational%20Patterns/Singleton/README.md) |
| Factory Method | [Factory Method](./Creational%20Patterns/Factory%20Method/README.md) |
| Abstract Factory | [Abstract Factory](./Creational%20Patterns/Abstract%20Factory/README.md) |
| Builder | [Builder](./Creational%20Patterns/Builder/README.md) |
| Prototype | [Prototype](./Creational%20Patterns/Prototype/README.md) |

### Structural

| Pattern | Folder |
| ------- | ------ |
| Adapter | [Adapter](./Structural%20Patterns/Adapter/README.md) |
| Bridge | [Bridge](./Structural%20Patterns/Bridge/README.md) |
| Composite | [Composite](./Structural%20Patterns/Composite/README.md) |
| Decorator | [Decorator](./Structural%20Patterns/Decorator/README.md) |
| Facade | [Facade](./Structural%20Patterns/Facade/README.md) |
| Flyweight | [Flyweight](./Structural%20Patterns/Flyweight/README.md) |
| Proxy | [Proxy](./Structural%20Patterns/Proxy/README.md) |

### Behavioral

| Pattern | Folder |
| ------- | ------ |
| Chain of Responsibility | [Chain of Responsibility](./Behavioral%20Patterns/Chain%20of%20Responsibility/README.md) |
| Command | [Command](./Behavioral%20Patterns/Command/README.md) |
| Interpreter | [Interpreter](./Behavioral%20Patterns/Interpreter/README.md) |
| Iterator | [Iterator](./Behavioral%20Patterns/Iterator/README.md) |
| Mediator | [Mediator](./Behavioral%20Patterns/Mediator/README.md) |
| Memento | [Memento](./Behavioral%20Patterns/Memento/README.md) |
| Observer | [Observer](./Behavioral%20Patterns/Observer/README.md) |
| State | [State](./Behavioral%20Patterns/State/README.md) |
| Strategy | [Strategy](./Behavioral%20Patterns/Strategy/README.md) |
| Template Method | [Template Method](./Behavioral%20Patterns/Template%20Method/README.md) |
| Visitor | [Visitor](./Behavioral%20Patterns/Visitor/README.md) |

---

## Architectural — diagram + Python + Java (folder per topic)

| Topic | Folder |
| ----- | ------ |
| MVC | [MVC](./Architectural%20Patterns/MVC/README.md) |
| MVP | [MVP](./Architectural%20Patterns/MVP/README.md) |
| MVVM | [MVVM](./Architectural%20Patterns/MVVM/README.md) |
| Dependency Injection | [Dependency Injection](./Architectural%20Patterns/Dependency%20Injection/README.md) |
| Repository | [Repository](./Architectural%20Patterns/Repository/README.md) |

The [Architectural Patterns](./Architectural%20Patterns/README.md) index also lists **many more names** (CQRS, BFF, Saga, …) as quick reference tables.

---

## Star / number printing — one folder per pattern (25)

Implementation lives in **[`print_patterns.py`](./Star%20Number%20Patterns/print_patterns.py)** and **[`PrintPatterns.java`](./Star%20Number%20Patterns/PrintPatterns.java)**. Each pattern also has a **short README** in its own subfolder:

| # | Link | # | Link |
| - | ---- | - | ---- |
| 1 | [Square Hollow](./Star%20Number%20Patterns/01-Square-Hollow/README.md) | 14 | [Left Half Pyramid](./Star%20Number%20Patterns/14-Left-Half-Pyramid/README.md) |
| 2 | [Number Triangle](./Star%20Number%20Patterns/02-Number-Triangle/README.md) | 15 | [Reverse Left Half](./Star%20Number%20Patterns/15-Reverse-Left-Half-Pyramid/README.md) |
| 3 | [Number Increasing Pyramid](./Star%20Number%20Patterns/03-Number-Increasing-Pyramid/README.md) | 16 | [K Pattern](./Star%20Number%20Patterns/16-K-Pattern/README.md) |
| 4 | [Number Increasing Reverse](./Star%20Number%20Patterns/04-Number-Increasing-Reverse-Pyramid/README.md) | 17 | [Triangle Star](./Star%20Number%20Patterns/17-Triangle-Star-Pattern/README.md) |
| 5 | [Number Changing / Floyd](./Star%20Number%20Patterns/05-Number-Changing-Pyramid/README.md) | 18 | [Reverse Number Triangle](./Star%20Number%20Patterns/18-Reverse-Number-Triangle/README.md) |
| 6 | [Zero–One Triangle](./Star%20Number%20Patterns/06-Zero-One-Triangle/README.md) | 19 | [Mirror / Hourglass](./Star%20Number%20Patterns/19-Mirror-Image-Triangle/README.md) |
| 7 | [Palindrome Triangle](./Star%20Number%20Patterns/07-Palindrome-Triangle/README.md) | 20 | [Hollow Triangle](./Star%20Number%20Patterns/20-Hollow-Triangle/README.md) |
| 8 | [Rhombus](./Star%20Number%20Patterns/08-Rhombus-Pattern/README.md) | 21 | [Hollow Reverse Triangle](./Star%20Number%20Patterns/21-Hollow-Reverse-Triangle/README.md) |
| 9 | [Diamond](./Star%20Number%20Patterns/09-Diamond-Pattern/README.md) | 22 | [Hollow Diamond](./Star%20Number%20Patterns/22-Hollow-Diamond-Pyramid/README.md) |
| 10 | [Butterfly](./Star%20Number%20Patterns/10-Butterfly-Star-Pattern/README.md) | 23 | [Hollow Hourglass](./Star%20Number%20Patterns/23-Hollow-Hourglass/README.md) |
| 11 | [Square Fill](./Star%20Number%20Patterns/11-Square-Fill-Pattern/README.md) | 24 | [Pascal’s Triangle](./Star%20Number%20Patterns/24-Pascals-Triangle/README.md) |
| 12 | [Right Half Pyramid](./Star%20Number%20Patterns/12-Right-Half-Pyramid/README.md) | 25 | [Right Pascal](./Star%20Number%20Patterns/25-Right-Pascals-Triangle/README.md) |
| 13 | [Reverse Right Half](./Star%20Number%20Patterns/13-Reverse-Right-Half-Pyramid/README.md) | | |

Full overview and commands: [Star Number Patterns](./Star%20Number%20Patterns/README.md).

---

## Why patterns matter (GoF)

* **Shared vocabulary** — “Factory”, “Observer”, “Strategy” name solutions quickly.  
* **Proven structure** — Less reinvention for common design problems.  
* **Not dogma** — Use what fits; avoid over-engineering.

---

## Suggested learning order

1. **Creational:** Singleton → Factory Method → Builder  
2. **Structural:** Adapter → Decorator → Facade → Proxy  
3. **Behavioral:** Observer → Strategy → Command → Template Method  
4. **Architectural:** MVC → Repository → Dependency Injection  
5. **Printing:** half pyramids → hollow shapes → Pascal  

---
