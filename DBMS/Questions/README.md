
---

### **1. What are ACID properties?** 💡

**ACID** stands for **Atomicity**, **Consistency**, **Isolation**, and **Durability**. These properties ensure that **database transactions** are processed reliably.

* **Atomicity**:
  All operations within a transaction are **completed** successfully, or none of them are applied. It's like an **all-or-nothing** approach.

  * **Example**: If you're transferring money from one bank account to another, both the **withdrawal** and **deposit** must succeed, or both fail.

* **Consistency**:
  The database must always be in a **valid state** before and after the transaction.

  * **Example**: The balance of an account should never go below zero.

* **Isolation**:
  Transactions are **independent** of one another. Even if multiple transactions are occurring simultaneously, each one should behave as if it's the only one running.

  * **Example**: One person buying a ticket should not interfere with another person buying the same ticket.

* **Durability**:
  Once a transaction is completed, its changes are **permanent**, even in the case of a system crash.

  * **Example**: If you make a payment online and the server crashes, your payment is still recorded once the system is restored.

---

### **2. What is denormalization?** 🔄

**Denormalization** is the process of **introducing redundancy** (duplicate data) into a database to improve performance. This is typically done when **read operations** are frequent, and the cost of multiple joins is high.

* **Example**:
  Instead of joining the `Orders` table with `Customers` for every query, you might store customer names directly in the `Orders` table.

---

### **3. What is a database?** 📚

A **database** is a **collection of organized data** that can be easily accessed, managed, and updated. It stores data in a structured format, usually in **tables**.

* **Example**:
  A **library database** stores information about books, authors, borrowers, etc.

---

### **4. What is a foreign key?** 🔗

A **foreign key** is a **column** (or set of columns) in one table that **references the primary key** of another table. It helps enforce referential integrity between two tables.

* **Example**:
  In an `Orders` table, `CustomerID` could be a foreign key that references the `CustomerID` in the `Customers` table. This ensures every order belongs to a valid customer.

---

### **5. What is RDBMS?** 🏛️

**RDBMS** stands for **Relational Database Management System**. It is a type of database system that stores data in **tables** that are related to each other through keys.

* **Examples**: MySQL, PostgreSQL, Oracle

---

### **6. What are the advantages of DBMS?** 🚀

* **Data Redundancy Reduction**: No duplicate data.
* **Data Integrity**: Ensures data accuracy and consistency.
* **Data Security**: Provides access control to data.
* **Concurrency Control**: Allows multiple users to access data simultaneously.
* **Backup and Recovery**: Efficient methods for data recovery after failure.

---

### **7. What is a stored procedure?** 📜

A **stored procedure** is a set of **SQL statements** that are precompiled and stored in the database. It can be executed multiple times with different parameters.

* **Example**:
  A stored procedure might be used to insert new records into a table or calculate payroll.

---

### **8. What are aggregate functions?** 📊

**Aggregate functions** are functions in SQL that perform **calculations** on a set of values and return a single result.

* **Common Aggregate Functions**:

  * **COUNT()**: Counts the number of rows.
  * **SUM()**: Adds values in a numeric column.
  * **AVG()**: Calculates the average value.
  * **MIN()**: Finds the smallest value.
  * **MAX()**: Finds the largest value.

---

### **9. What are the types of normalization?** 🧮

**Normalization** is the process of organizing data to avoid redundancy and dependency. The most common **Normal Forms (NF)** are:

* **1NF (First Normal Form)**:
  Ensures that each column contains **atomic** (indivisible) values.

* **2NF (Second Normal Form)**:
  Ensures that data is **fully dependent** on the primary key, removing partial dependencies.

* **3NF (Third Normal Form)**:
  Removes **transitive dependencies** (non-key columns should not depend on other non-key columns).

* **BCNF (Boyce-Codd Normal Form)**:
  Every determinant in the table is a **candidate key**.

---

### **10. What is DBMS?** 🧑‍💻

A **DBMS** (Database Management System) is software used to store, retrieve, and manage databases. It provides an interface between users and the database.

* **Examples**:
  MySQL, PostgreSQL, Oracle, SQL Server.

---

### **11. What is a join?** 🔗

A **join** is an SQL operation used to combine data from two or more tables based on a related column.

* **Types of Joins**:

  * **INNER JOIN**: Returns only matching rows.
  * **LEFT JOIN**: Returns all rows from the left table, matching rows from the right table.
  * **RIGHT JOIN**: Returns all rows from the right table, matching rows from the left table.

---

### **12. What is normalization?** 🔢

**Normalization** is the process of organizing data in the database to minimize redundancy and dependency. It involves dividing large tables into smaller ones and ensuring that relationships are defined properly.

* **Benefits**: Reduces data duplication, ensures data integrity.

---

### **13. Explain different languages present in DBMS.** 🗣️

In DBMS, we use different languages to interact with the database:

1. **DDL (Data Definition Language)**: Used to define the structure of the database (e.g., `CREATE`, `ALTER`, `DROP`).
2. **DML (Data Manipulation Language)**: Used to manipulate the data (e.g., `INSERT`, `UPDATE`, `DELETE`).
3. **DCL (Data Control Language)**: Used to control access to the data (e.g., `GRANT`, `REVOKE`).
4. **TCL (Transaction Control Language)**: Used to manage transactions (e.g., `COMMIT`, `ROLLBACK`).

---

### **14. What is concurrency control?** 👥

**Concurrency control** is the management of simultaneous access to the database to ensure **correctness** and **data integrity**. It ensures that multiple users can access the database without conflicts.

* **Techniques**: Locking, Time-stamping, Optimistic concurrency control.

---

### **15. What are clustered and non-clustered indexes?** 🔍

* **Clustered Index**:
  The data in the table is **physically ordered** based on the indexed column. A table can only have **one** clustered index.

* **Non-clustered Index**:
  The data is stored **separately**, and the index contains pointers to the data. A table can have **multiple** non-clustered indexes.

---

### **16. What are indexes?** 🗂️

An **index** is a **data structure** that improves the speed of data retrieval operations. It’s like a **map** for the database that helps quickly find the location of data.

* **Example**:
  A book’s **index** helps you quickly find where topics are discussed.

---

### **17. What is a primary key?** 🔑

A **primary key** is a **unique identifier** for each record in a table. It cannot be **NULL** and must be **unique** for every record.

* **Example**:
  In a `Customers` table, `CustomerID` could be the primary key.

---

### **18. What is a subquery?** 🔄

A **subquery** is a query that is embedded within another query. It is used to retrieve data that will be used by the outer query.

* **Example**:

  ```sql
  SELECT Name FROM Employees WHERE DepartmentID = (SELECT DepartmentID FROM Departments WHERE Name = 'HR');
  ```

---

### **19. What is a trigger?** 🧯

A **trigger** is a set of **SQL statements** that automatically execute when a specific event occurs in the database (e.g., `INSERT`, `UPDATE`, `DELETE`).

* **Example**:
  A trigger can automatically log changes made to a `Customers` table when an update occurs.

---

### **20. What is data integrity?** 🛡️

**Data integrity** ensures that the data in the database is **accurate**, **consistent**, and **reliable**.

* **Types**:

  * **Entity Integrity**: Ensures each record has a unique identifier.
  * **Referential Integrity**: Ensures relationships between tables are valid.
  * **Domain Integrity**: Ensures data values are valid according to defined rules.

---

### **21. What is DBMS and its types?** 🧑‍


💻

A **DBMS** (Database Management System) is software that allows you to store, retrieve, and manage data.

* **Types of DBMS**:

  * **Hierarchical DBMS**: Organizes data in a tree-like structure.
  * **Network DBMS**: Uses a graph structure to represent relationships.
  * **Relational DBMS**: Uses tables (rows and columns) to store data.
  * **Object-oriented DBMS**: Stores data as objects, similar to programming languages.

---

### **22. What is normalization in DBMS?** 🔢

**Normalization** is the process of organizing data to eliminate redundancy and ensure consistency. It involves dividing tables and establishing relationships.

* **Goal**: Minimize **data duplication** and enforce **data integrity**.

---

### **23. What is SQL?** 💻

**SQL** (Structured Query Language) is a **standard language** used for managing and manipulating databases. It allows you to query, update, insert, and delete data.

---

### **24. Explain ER-Model.** 🖼️

The **Entity-Relationship (ER)** model is a conceptual framework for designing databases. It uses **entities** (objects or things) and **relationships** between them.

* **Components**:

  * **Entity**: Represents a real-world object (e.g., `Customer`).
  * **Attribute**: Properties of entities (e.g., `CustomerName`).
  * **Relationship**: Describes how entities are related (e.g., `Customer` places `Order`).

---

