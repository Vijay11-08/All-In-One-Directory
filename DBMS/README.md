
---

### ✅ **1. What is a Database Management System (DBMS)?**

**Answer:**
A Database Management System (DBMS) is software that allows users to define, create, maintain, and control access to a database. It provides an interface between users and the database, ensuring data is consistently organized, efficiently retrieved, and securely managed.

**Key Features:**

* Data abstraction and independence
* Efficient query processing
* Data integrity and security
* Multi-user access and concurrency control
* Backup and recovery

---

### ✅ **2. What are the types of DBMS?**

**Answer:**
The four main types of DBMS are:

1. **Hierarchical DBMS** – Data is organized in a tree-like structure. E.g., IBM IMS.
2. **Network DBMS** – Supports many-to-many relationships using pointers. E.g., Integrated Data Store (IDS).
3. **Relational DBMS (RDBMS)** – Stores data in tables (relations) using rows and columns. E.g., MySQL, PostgreSQL, Oracle.
4. **Object-Oriented DBMS (OODBMS)** – Data is represented as objects, similar to OOP. E.g., db4o.

---

### ✅ **3. What is normalization? Explain its types.**

**Answer:**
Normalization is the process of organizing data in a database to reduce redundancy and improve data integrity.

**Forms of Normalization:**

* **1NF (First Normal Form):** Ensures atomicity (no repeating groups).
* **2NF:** Achieved when it is in 1NF and all non-prime attributes are fully functionally dependent on the primary key.
* **3NF:** In 2NF and no transitive dependency exists.
* **BCNF (Boyce-Codd NF):** A stricter version of 3NF; every determinant must be a candidate key.

---

### ✅ **4. What is a primary key? Can it be NULL?**

**Answer:**
A **primary key** is a column (or set of columns) that uniquely identifies each record in a table. It **cannot be NULL** and must contain **unique values**.

> Example: `StudentID` in a `Students` table.

---

### ✅ **5. What is the difference between `WHERE` and `HAVING` clause in SQL?**

**Answer:**

* `WHERE` filters **rows** before grouping.
* `HAVING` filters **groups** after `GROUP BY`.

**Example:**

```sql
SELECT department, COUNT(*) 
FROM employees 
WHERE salary > 50000 
GROUP BY department 
HAVING COUNT(*) > 5;
```

---

### ✅ **6. What is a foreign key?**

**Answer:**
A **foreign key** is a column (or group of columns) that creates a relationship between two tables. It refers to the **primary key** of another table, ensuring referential integrity.

> Example: `Order.CustomerID` → references `Customer.CustomerID`

---

### ✅ **7. Explain ACID properties.**

**Answer:**
ACID ensures reliable database transactions:

* **Atomicity** – All operations in a transaction are completed; if not, none are applied.
* **Consistency** – The database remains in a valid state before and after the transaction.
* **Isolation** – Transactions execute independently without interference.
* **Durability** – Once a transaction is committed, it is permanently recorded.

---

### ✅ **8. What is indexing in DBMS? Why is it used?**

**Answer:**
**Indexing** is a data structure technique that improves the speed of data retrieval operations on a table at the cost of additional storage.

* Types: **Primary index**, **Secondary index**, **Composite index**, **Clustered**, and **Non-clustered**
* It works like a book’s index – you don’t search every page.

---

### ✅ **9. What is the difference between DELETE, TRUNCATE, and DROP?**

**Answer:**

| Command    | Description               | Can Rollback?           | Removes Structure? |
| ---------- | ------------------------- | ----------------------- | ------------------ |
| `DELETE`   | Removes selected rows     | Yes (if in transaction) | No                 |
| `TRUNCATE` | Removes all rows quickly  | No                      | No                 |
| `DROP`     | Deletes the table from DB | No                      | Yes                |

---

### ✅ **10. What is the difference between OLTP and OLAP?**

**Answer:**

| Feature   | OLTP                          | OLAP                         |
| --------- | ----------------------------- | ---------------------------- |
| Full Form | Online Transaction Processing | Online Analytical Processing |
| Usage     | Operational systems           | Analytical systems           |
| Queries   | Simple, short queries         | Complex, large queries       |
| Data      | Current data                  | Historical data              |
| Examples  | ATM systems, e-commerce       | Data warehouses, BI tools    |

---

