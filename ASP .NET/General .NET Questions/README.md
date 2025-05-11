
---

### **1. What is .NET and how does it work? What are its main components (CLR, FCL)?** 💻

**.NET** is a framework for building and running applications. It provides a runtime environment, libraries, and tools for developing desktop, mobile, web, and cloud applications.

* **CLR (Common Language Runtime)**: The runtime environment that manages the execution of .NET applications. It provides services such as **garbage collection**, **JIT (Just-in-Time) compilation**, and **type safety**.

* **FCL (Framework Class Library)**: A library of pre-written classes, interfaces, and value types used to develop .NET applications. It provides functionality like file I/O, database interaction, and network communication.

---

### **2. What is the difference between managed and unmanaged code?** 🔄

* **Managed Code**: Code that runs under the control of the CLR (Common Language Runtime) in .NET. The CLR manages memory, garbage collection, and type safety.

* **Unmanaged Code**: Code that runs directly on the operating system (OS), outside the control of the CLR. It requires manual memory management (e.g., C++).

---

### **3. What is the Common Language Runtime (CLR)? What are its key functions (JIT, Garbage Collection)?** 🧑‍💻

The **Common Language Runtime (CLR)** is the heart of the .NET runtime environment, responsible for managing the execution of .NET applications.

* **JIT (Just-in-Time Compilation)**: Converts the **Intermediate Language (IL)** code into machine code just before it’s executed.
* **Garbage Collection**: Automatically handles memory management by reclaiming unused memory, ensuring optimal performance.

---

### **4. What is the .NET Framework Class Library (FCL) or Base Class Library (BCL)?** 📚

The **.NET Framework Class Library (FCL)**, also called the **Base Class Library (BCL)**, is a collection of reusable classes, interfaces, and value types that provide essential functionality for .NET applications. These libraries cover things like:

* I/O (File System, Streams)
* Networking (Sockets, HTTP)
* Data Access (ADO.NET, Entity Framework)
* User Interface (Windows Forms, WPF)

---

### **5. What is an assembly in .NET? What are the different types of assemblies (private, shared)?** 🏗️

An **assembly** is a compiled unit of code in .NET, either a **DLL** (Dynamic Link Library) or an **EXE** file, that contains metadata and code.

* **Private Assembly**: Used by a single application and stored in the application's directory.
* **Shared Assembly**: Can be used by multiple applications and stored in the **Global Assembly Cache (GAC)**.

---

### **6. What is the Global Assembly Cache (GAC)?** 🌍

The **Global Assembly Cache (GAC)** is a central repository where shared assemblies are stored. It ensures that multiple applications can use the same version of an assembly, reducing versioning conflicts.

---

### **7. What is the difference between value types and reference types in .NET?** 🔄

* **Value Types**: Hold their data directly. Examples include **int**, **char**, **bool**, and **struct**.

  * **Stored on the stack**.
  * Copying a value type creates a **new copy**.
* **Reference Types**: Store references (memory addresses) to the actual data. Examples include **class**, **string**, **array**, and **delegate**.

  * **Stored on the heap**.
  * Copying a reference type creates a **reference** to the original object.

---

### **8. What is boxing and unboxing in .NET?** 🎁

* **Boxing**: Converting a **value type** to a **reference type** (i.e., an object). This is done automatically by the runtime.

  ```csharp
  int num = 5;
  object obj = num;  // Boxing
  ```

* **Unboxing**: Converting a **reference type** (object) back to a **value type**.

  ```csharp
  object obj = 5;
  int num = (int)obj;  // Unboxing
  ```

---

### **9. What is the difference between an interface and an abstract class in C#?** 🏛️

* **Interface**: Defines a contract that classes must implement. It only contains **method signatures** and **properties**.

  * **Multiple inheritance** is allowed (a class can implement multiple interfaces).

* **Abstract Class**: A class that cannot be instantiated directly. It can contain both **abstract methods** (without implementation) and **concrete methods** (with implementation).

  * A class can inherit from only **one abstract class**.

---

### **10. What are delegates and events in C#?** 🎤

* **Delegate**: A type that represents a reference to a method with a specific signature. It allows **method invocation** through variables.

  ```csharp
  delegate void MyDelegate(string message);
  ```

* **Event**: A special type of delegate used to **notify** multiple objects when something occurs. It is used to implement the **Observer design pattern**.

  ```csharp
  public event EventHandler MyEvent;
  ```

---

### **11. What is asynchronous programming in .NET? How do async and await keywords work?** ⏳

**Asynchronous programming** allows your application to execute tasks without blocking the main thread, improving responsiveness.

* **async**: Marks a method as asynchronous and indicates it will contain **await** expressions.
* **await**: Pauses the execution of the method until the awaited task completes.

```csharp
public async Task<int> GetDataAsync()
{
    var result = await Task.Run(() => 42);
    return result;
}
```

---

### **12. What are generics in C#? What are their benefits?** 🔠

**Generics** allow you to define types (e.g., classes, methods, and interfaces) with **type parameters**, making the code more **flexible and reusable** while maintaining type safety.

* **Benefit**: **Type safety** (no need for casting) and **performance** (no boxing or unboxing).

  ```csharp
  public class MyClass<T> 
  {
      public T Value { get; set; }
  }
  ```

---

### **13. Explain the principles of SOLID in object-oriented design and how they apply to .NET development.** 💡

**SOLID** is a set of principles for **object-oriented design** that help improve code maintainability and readability.

* **S**: **Single Responsibility Principle** – A class should have only one reason to change.
* **O**: **Open/Closed Principle** – A class should be open for extension but closed for modification.
* **L**: **Liskov Substitution Principle** – Objects of a superclass should be replaceable with objects of a subclass without affecting correctness.
* **I**: **Interface Segregation Principle** – Clients should not be forced to depend on interfaces they do not use.
* **D**: **Dependency Inversion Principle** – High-level modules should not depend on low-level modules; both should depend on abstractions.

---

### **14. What is the purpose of garbage collection in .NET? How does it work?** 🗑️

**Garbage Collection** is an automatic memory management process that frees up memory used by objects that are no longer in use, preventing memory leaks.

* **How it works**: The **GC** runs in the background, periodically checking for objects that are no longer referenced and releasing their memory.

---

### **15. What is the difference between .NET Framework, .NET Core, and .NET 5+?** 🔄

* **.NET Framework**: The original version, running only on **Windows**. It includes libraries for web, desktop, and more.

* **.NET Core**: A **cross-platform**, open-source version of the .NET runtime that runs on **Windows, macOS, and Linux**.

* **.NET 5+**: A **unified platform** that combines features from **.NET Framework** and **.NET Core** into a single platform for web, desktop, mobile, cloud, and more. It's part of the **.NET 6** and future versions.

---


