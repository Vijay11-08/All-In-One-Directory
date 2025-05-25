
---

### ✅ **1. What is RESTful API and how is it different from SOAP?**

**REST (Representational State Transfer)** is an **architectural style** for building web services using standard HTTP methods like GET, POST, PUT, DELETE.

**SOAP (Simple Object Access Protocol)** is a **protocol** that uses XML-based messaging.

| Feature     | RESTful API                    | SOAP                                   |
| ----------- | ------------------------------ | -------------------------------------- |
| Format      | JSON (or XML, etc.)            | XML only                               |
| Protocol    | HTTP/HTTPS                     | HTTP, SMTP, TCP, etc.                  |
| Lightweight | Yes                            | No (heavier with XML and strict rules) |
| Flexibility | More flexible, easier to scale | More rigid, harder to maintain         |
| Use Cases   | Web/Mobile apps, CRUD APIs     | Enterprise-level apps (e.g., banking)  |

---

### ✅ **2. How do you handle errors in APIs?**

Error handling in APIs ensures that clients receive **clear, consistent, and meaningful** error responses.

**Best Practices:**

* Use appropriate **HTTP status codes** (e.g., `400`, `404`, `500`)
* Return a JSON body with `error message` and `code`
* Log server-side errors for debugging

**Example JSON Error Response:**

```json
{
  "error": "Invalid request",
  "code": 400,
  "details": "Email field is required"
}
```

In **Express (Node.js)**:

```js
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).json({ error: "Internal Server Error" });
});
```

---

### ✅ **3. What is the status code 201, 204, and 500 used for?**

| Status Code | Meaning               | Use Case                                                                      |
| ----------- | --------------------- | ----------------------------------------------------------------------------- |
| `201`       | Created               | When a **new resource is successfully created** (e.g., new user or product)   |
| `204`       | No Content            | Request was successful, but **no content to return** (e.g., DELETE operation) |
| `500`       | Internal Server Error | Generic **server-side error** when something goes wrong                       |

---

### ✅ **4. How do you secure an API?**

**Common ways to secure an API:**

1. 🔐 **Authentication**:

   * Use **JWT**, OAuth, or API keys
2. 🔒 **Authorization**:

   * Role-based access (admin, user)
3. ⚠️ **Input validation and sanitization**:

   * Prevents injection attacks
4. 🔐 **HTTPS**:

   * Encrypts data in transit
5. 🧱 **Rate limiting & throttling**:

   * Prevents abuse and DDoS
6. 📋 **CORS policies**:

   * Control which origins are allowed to access the API

**Example (JWT middleware in Express):**

```js
function verifyToken(req, res, next) {
  const token = req.headers.authorization;
  if (!token) return res.status(401).send("Access denied");
  // Validate token...
  next();
}
```

---

### ✅ **5. What tools do you use to test your APIs (e.g., Postman)?**

Here are commonly used tools:

| Tool             | Purpose                                                                |
| ---------------- | ---------------------------------------------------------------------- |
| **Postman**      | Send HTTP requests, test endpoints, add headers/body, automate testing |
| **cURL**         | Command-line tool to test APIs                                         |
| **Insomnia**     | API testing with a modern interface                                    |
| **Swagger UI**   | Test API endpoints from OpenAPI docs                                   |
| **Jest / Mocha** | Write automated API unit/integration tests                             |

👉 **Postman** is the most commonly used for development and testing.

---

