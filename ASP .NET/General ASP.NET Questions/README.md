
---

### **1. What is ASP.NET?** 🌐

**ASP.NET** is a **web application framework** developed by Microsoft to build dynamic websites, web applications, and web services. It provides tools and libraries to develop robust web applications with support for languages like C# and VB.NET.

* **Example**: A website like an online store, social media site, or an e-learning platform can be developed using ASP.NET.

---

### **2. What are the advantages of using ASP.NET?** 🚀

* **Scalability**: Easily scale applications as they grow.
* **Security**: Built-in security features like authentication and authorization.
* **Performance**: High performance with features like just-in-time compilation.
* **Cross-Platform Support**: ASP.NET Core runs on Windows, Linux, and macOS.
* **Rich Toolbox**: A wide range of pre-built controls and libraries.

---

### **3. Explain the ASP.NET page life cycle.** 🔄

The **ASP.NET page life cycle** refers to the series of steps a page undergoes from the time it's requested to the time it's rendered. The main stages are:

1. **Page Request**: The page is requested by the user.
2. **Page Initialization**: Controls are initialized with their default values.
3. **Page Load**: Data is loaded into the controls.
4. **Postback**: If the page is being requested again, it retains its state.
5. **Page Rendering**: HTML is generated for the response.
6. **Page Unload**: Resources are released.

---

### **4. What is the difference between ASP.NET Web Forms and ASP.NET MVC?** ⚖️

* **Web Forms**:

  * Event-driven model.
  * Provides a rich set of controls.
  * Automatically handles UI generation and data binding.
  * Easier for beginners.
* **MVC**:

  * Follows the **Model-View-Controller** pattern.
  * Provides more control over HTML output and URL routing.
  * Better for large, complex applications.

---

### **5. What is the role of the Global.asax file?** 🌍

The **Global.asax** file is used to handle **application-level events** such as:

* **Application Start**: When the app is started.
* **Session Start**: When a user session starts.
* **Application Error**: To handle global errors.

---

### **6. What is the purpose of the Web.config file?** ⚙️

The **Web.config** file is an XML file used to configure an ASP.NET application. It stores settings like:

* **Connection strings** for databases.
* **Authentication** and **authorization** settings.
* **Error handling** configurations.
* **Custom application settings**.

---

### **7. What are Web Controls in ASP.NET? Can you list a few?** ⚙️

**Web Controls** in ASP.NET are **server-side controls** that generate HTML and handle user interaction. Some common controls are:

* **Button**: `<asp:Button>`
* **Label**: `<asp:Label>`
* **TextBox**: `<asp:TextBox>`
* **DropDownList**: `<asp:DropDownList>`
* **GridView**: `<asp:GridView>`

---

### **8. What is ViewState and how does it work? What are its advantages and disadvantages?** 🏷️

**ViewState** is used to **preserve the state of controls** between postbacks. It stores values in a hidden field on the page.

* **Advantages**:

  * Retains data across requests.
  * Easy to implement.
* **Disadvantages**:

  * Can cause **performance issues** if the page has a lot of data.
  * Increases the page size, impacting load times.

---

### **9. What is a PostBack in ASP.NET?** 🔄

A **PostBack** occurs when a page is sent back to the server for processing (e.g., submitting a form). It allows the server to regenerate the page based on the data from the form.

---

### **10. Explain the HTTP request-response cycle in ASP.NET.** 🌐

1. **HTTP Request**: The browser sends a request to the web server.
2. **Processing**: The server processes the request, including executing any required code.
3. **HTTP Response**: The server sends a response back to the browser, usually HTML, CSS, and JavaScript.

---

### **11. What are the different types of authentication available in ASP.NET?** 🔑

* **Windows Authentication**: Uses Windows accounts to authenticate users.
* **Forms Authentication**: Custom authentication where user credentials are validated by forms.
* **Passport Authentication**: Used for authentication with Microsoft’s Passport service.
* **Token-Based Authentication**: Uses tokens for session management (common in APIs).

---

### **12. What are Session and Cookies in ASP.NET? How are they different?** 🍪

* **Session**: Stores data on the server, and data is available as long as the session lasts (can be stateful).
* **Cookies**: Stores small amounts of data on the client’s browser, typically used for state management.

**Difference**:

* **Session** is stored on the server, **cookies** on the client.
* **Session** is more secure, **cookies** can be manipulated by the client.

---

### **13. What is the difference between Response.Redirect and Server.Transfer?** 🔄

* **Response.Redirect**:
  Redirects the user to a different page, causing a new request to the server.

* **Server.Transfer**:
  Transfers control to another page on the server **without** making a new request (keeps the URL same).

---

### **14. What are User Controls and Custom Controls in ASP.NET? What are the differences?** 🛠️

* **User Controls**:
  Reusable controls that combine HTML and server-side code. Created using `.ascx` files.

* **Custom Controls**:
  Fully reusable controls created by inheriting from existing control classes.

**Difference**:

* **User Controls** are easier to implement, while **Custom Controls** offer more flexibility and functionality.

---

### **15. What is caching in ASP.NET? What are the different types of caching?** 💾

**Caching** improves performance by storing frequently used data in memory. Types of caching:

* **Output Caching**: Caches the whole page’s output.
* **Data Caching**: Caches objects or data in memory.
* **Application Caching**: Caches data at the application level, shared by all users.
* **Distributed Caching**: Caches data in a distributed environment (e.g., Redis).

---

### **16. What is LINQ (Language Integrated Query)? How does it work?** 🧑‍💻

**LINQ** is a **set of methods** that allow querying collections of objects directly in C# or VB.NET using SQL-like syntax.

* **Example**:

  ```csharp
  var result = from p in products where p.Price > 100 select p;
  ```

It works by enabling **declarative queries** over collections and databases.

---

### **17. What is Entity Framework?** 🔗

**Entity Framework** (EF) is an **Object-Relational Mapper (ORM)** that allows developers to interact with a database using **C# objects** rather than SQL queries. It helps in **data modeling** and **database access**.

---

### **18. What is IIS (Internet Information Services)? Why is it used with ASP.NET?** 🌍

**IIS** is a **web server** from Microsoft that provides hosting for web applications. It’s used with **ASP.NET** to serve web applications, handle requests, and manage HTTP traffic.

---

### **19. What are Web Services in ASP.NET?** 🌐

**Web Services** are used to enable communication between different software applications over the web. They use **SOAP** or **REST** protocols.

* **Example**: A weather service that provides weather data via an API.

---

### **20. What is the purpose of Validation Controls in ASP.NET? Can you name a few?** ✅

**Validation Controls** in ASP.NET are used to validate user input to ensure it’s correct before submitting it to the server.

* **Examples**:

  * **RequiredFieldValidator**: Ensures a field is not empty.
  * **RangeValidator**: Ensures input is within a specific range.
  * **RegularExpressionValidator**: Validates input based on a regular expression.

---

### **21. What is routing in ASP.NET MVC?** 🛤️

**Routing** is the process of mapping incoming requests (URLs) to controller actions in ASP.NET MVC. It allows for **clean and friendly URLs**.

---

### **22. Explain the MVC (Model-View-Controller) architecture. What are its main components?** 🏗️

**MVC** is a software design pattern used for developing web applications by separating concerns:

* **Model**: Represents the data and business logic.
* **View**: Represents the UI (user interface).
* **Controller**: Handles user input, updates the model, and selects the view.

---

### **23. What are Action Results in ASP.NET MVC?** 🎬

**Action Results** are the return types of controller actions that determine what is rendered to the user.

* **Examples**:

  * **ViewResult**: Renders a view.
  * **RedirectResult**: Redirects to another URL.
  * **JsonResult**: Returns data in JSON format.

---

### **24. What are HTML Helpers in ASP.NET MVC?** ⚙️

**HTML Helpers** are methods that generate HTML elements in ASP.NET MVC.

* **Examples**:

  * `@Html.TextBoxFor()`: Renders a text box.
  * `@Html.DropDownListFor()`: Renders a drop-down list.

---

### **25. What is a Layout Page in ASP.NET MVC?** 📄

A **Layout Page** is a template used to define a common structure for views in an MVC application (like headers, footers). It reduces code repetition.

---

### **26. What are Filters in ASP.NET MVC? Can you list different types of filters?** 🧑‍🔧

**Filters** allow you to run code at specific stages of the MVC request pipeline.

* **Types of Filters**:

  * **Authorization Filters**: Run before the action executes to check if the user is authorized.
  * **Action Filters**: Run before and after the action method executes.
  * **Exception Filters**: Handle exceptions thrown by actions.
  * **Result Filters**: Run before and after the view result is returned.

---

### **27. What is Model Binding in ASP.NET MVC?** 🔗

**Model Binding** is the process of mapping HTTP request data to the parameters of a controller action. It allows **automatic data population** for model properties.

---

### **28. What is Dependency Injection in ASP.NET?** 🔌

**Dependency Injection (DI)** is a technique where an object’s dependencies are provided rather than created by the object itself. It helps in making your code more **testable** and **decoupled**.

---

