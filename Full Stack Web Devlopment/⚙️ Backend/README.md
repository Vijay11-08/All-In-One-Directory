
### ✅ **1. What is middleware in Node.js/Express?**

* Middleware is a **function** that has access to the **request**, **response**, and the **next middleware** in the request-response cycle.
* It’s used to:

  * Execute code (e.g., logging, validation)
  * Modify `req` or `res` objects
  * End the request-response cycle
  * Call the next middleware

**Example:**

```js
app.use((req, res, next) => {
  console.log('Request URL:', req.url);
  next(); // Pass control to the next middleware
});
```

👉 Built-in middleware: `express.json()`, `express.static()`

---

### ✅ **2. How do you handle authentication and authorization in your backend?**

* **Authentication**: Verifies the **identity** of a user (e.g., login with email/password).
* **Authorization**: Determines what a **user is allowed to do** (e.g., admin access).

**Common approaches:**

* Use **JWT (JSON Web Tokens)** or **sessions** for authentication.
* Protect routes using **middleware**:

```js
function authMiddleware(req, res, next) {
  const token = req.headers.authorization;
  // Verify token logic here
  if (validUser) next();
  else res.status(401).send("Unauthorized");
}
```

* **Role-based access control (RBAC)** for authorization.

👉 Libraries: `passport.js`, `jsonwebtoken`, `bcrypt` for hashing passwords.

---

### ✅ **3. What is dependency injection in ASP.NET Core?**

* Dependency Injection (DI) is a **design pattern** used to achieve **loose coupling**.
* In ASP.NET Core, DI is **built-in** and allows services (classes) to be injected into controllers or other services.

**Example:**

```csharp
public class HomeController : Controller
{
    private readonly IProductService _service;
    public HomeController(IProductService service)
    {
        _service = service;
    }
}
```

**Registering the service in `Startup.cs`:**

```csharp
services.AddScoped<IProductService, ProductService>();
```

👉 Benefits: Easier testing, better maintainability, and separation of concerns.

---

### ✅ **4. What are HTTP methods and when would you use PUT vs PATCH?**

* **HTTP methods** define the **type of operation** you want to perform on a resource:

  * `GET` – Read data
  * `POST` – Create data
  * `PUT` – **Replace** the entire resource
  * `PATCH` – **Update** part of the resource
  * `DELETE` – Remove data

**PUT vs PATCH:**

* `PUT` – Updates the **whole resource**, replacing it.
* `PATCH` – Updates **only specific fields**.

**Example:**

```json
// PUT
{
  "name": "John",
  "email": "john@example.com"
}

// PATCH
{
  "email": "john@example.com"
}
```

---

### ✅ **5. Explain MVC architecture with an example.**

**MVC** stands for **Model-View-Controller**:

* **Model**: Handles data and business logic (e.g., database models).
* **View**: The UI (HTML/CSS) that the user sees.
* **Controller**: Receives user input, interacts with models, and returns views.

**Example in ASP.NET Core MVC:**

* **Model**: `Product.cs`

```csharp
public class Product {
  public int Id { get; set; }
  public string Name { get; set; }
}
```

* **Controller**: `ProductController.cs`

```csharp
public IActionResult Index() {
  var products = _context.Products.ToList();
  return View(products);
}
```

* **View**: `Index.cshtml`

```html
@foreach (var item in Model) {
  <p>@item.Name</p>
}
```
