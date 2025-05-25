
---

### ✅ **1. What is the difference between SQL and NoSQL?**

| Feature        | SQL (Relational DB)             | NoSQL (Non-relational DB)                     |
| -------------- | ------------------------------- | --------------------------------------------- |
| Data Model     | Table-based (rows & columns)    | Document, key-value, graph, or columnar       |
| Schema         | Fixed schema, structured        | Dynamic schema, semi-structured               |
| Query Language | SQL (Structured Query Language) | Varies (e.g., MongoDB uses JSON-like queries) |
| Transactions   | Strong ACID compliance          | Often BASE (eventual consistency)             |
| Examples       | MySQL, PostgreSQL, SQL Server   | MongoDB, Cassandra, Firebase, Redis           |

👉 Use **SQL** when data consistency is critical, and **NoSQL** for scalability and flexible data structures.

---

### ✅ **2. How do you perform joins in SQL?**

* Joins combine rows from **two or more tables** based on related columns.

**Types of Joins:**

1. `INNER JOIN`: Returns rows that match in both tables.
2. `LEFT JOIN`: All rows from the left table + matched rows from the right.
3. `RIGHT JOIN`: All rows from the right table + matched rows from the left.
4. `FULL JOIN`: All rows when there's a match in one of the tables.

**Example:**

```sql
SELECT Orders.OrderID, Customers.CustomerName
FROM Orders
INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
```

---

### ✅ **3. Explain database normalization. Why is it important?**

* **Normalization** is the process of organizing data to:

  * Remove redundancy
  * Ensure data integrity
  * Optimize storage

**Normal Forms:**

1. **1NF**: Eliminate repeating groups (atomic columns).
2. **2NF**: Remove partial dependencies.
3. **3NF**: Remove transitive dependencies.

**Why it's important:**

* Reduces data duplication.
* Simplifies data maintenance and updates.
* Improves query efficiency in many cases.

---

### ✅ **4. What is an ORM? Have you used one (like Entity Framework or Sequelize)?**

* ORM = **Object-Relational Mapping**
* It maps **database tables** to **objects/classes** in code, allowing developers to work with DB data as native objects.

**Benefits:**

* Reduces boilerplate SQL
* Improves productivity
* Enables code-first design
* Handles relationships, migrations, and more

**Examples:**

* `.NET`: **Entity Framework Core**
* `Node.js`: **Sequelize**
* `Python`: SQLAlchemy

**Usage Example in Entity Framework (C#):**

```csharp
var product = new Product { Name = "Phone", Price = 699 };
_context.Products.Add(product);
_context.SaveChanges();
```

---

### ✅ **5. How do you prevent SQL injection in your application?**

SQL Injection happens when untrusted input is directly included in SQL queries.

**Prevention Techniques:**

1. ✅ **Use Parameterized Queries / Prepared Statements**

   * SQL / Entity Framework / Sequelize all support this

   ```csharp
   var user = context.Users.SingleOrDefault(u => u.Email == email);
   ```
2. ✅ **ORMs** like EF and Sequelize handle this automatically.
3. ✅ **Validate & sanitize** user input (e.g., email, ID, search terms).
4. ❌ **Avoid string concatenation** in queries.
5. ✅ Use **stored procedures** when applicable.
6. ✅ Enable **input validation libraries** and frameworks.

---

