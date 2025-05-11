
---
## **1. Primary Key (PK)** 🔐

### 🔍 **Definition:**

A **Primary Key** is a **unique identifier** for a record in a table. Each table can only have **one Primary Key**, and it must **uniquely** identify each row in that table.

* **Uniqueness:** Ensures no duplicate values in the primary key column(s).
* **Non-nullability:** Cannot contain `NULL` values.
* **Minimality:** Should contain the least number of columns necessary to uniquely identify a record.

### ⚙️ **Usage:**

* Usually used on a column that represents an entity's **unique identity** (e.g., `StudentID`, `OrderID`).
* In **relational design**, it’s essential for referencing rows.

### 💡 **Example:**

```sql
CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT
);
```

---

## **2. Foreign Key (FK)** 🌍

### 🔍 **Definition:**

A **Foreign Key** is a field (or a set of fields) in a table that links to the **Primary Key** in another table, creating a **relationship** between them.

* **Referential Integrity:** Ensures that a value in the foreign key column must exist in the referenced primary key column or be `NULL`.
* **Optionality:** Can be `NULL` (if no corresponding record exists in the referenced table).

### ⚙️ **Usage:**

* Used to link **related data** across tables (e.g., `OrderID` in an `Orders` table might be a foreign key referring to `OrderID` in the `OrdersDetails` table).
* **Cascading:** Can have actions like `ON DELETE CASCADE`, `ON UPDATE CASCADE` to maintain consistency automatically.

### 💡 **Example:**

```sql
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    OrderDate DATE
);

CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);
```

---

## **3. Unique Key** 🆔

### 🔍 **Definition:**

A **Unique Key** ensures that all values in a column or a combination of columns are **unique** across rows in the table, but unlike a primary key, it **allows null values**.

* **Nullability:** Can accept `NULL` values, but each `NULL` is treated as a distinct value (which can be unusual in some DBMS like MySQL).
* **Multiple Unique Keys:** A table can have **multiple unique keys**.

### ⚙️ **Usage:**

* Enforces uniqueness, but doesn’t require a **mandatory value** (unlike primary keys).
* Can be useful when there are fields other than primary keys that should also be unique, like `Email` or `Username`.

### 💡 **Example:**

```sql
CREATE TABLE Users (
    UserID INT PRIMARY KEY,
    Username VARCHAR(100) UNIQUE,
    Email VARCHAR(100) UNIQUE
);
```

---

## **4. Candidate Key** 🧩

### 🔍 **Definition:**

A **Candidate Key** is a **set of attributes** that could serve as the **primary key** of a table. Each candidate key can uniquely identify rows in a table, but **only one** candidate key becomes the primary key.

* **Minimality:** A candidate key must be **minimal**; no subset of its attributes can uniquely identify records.
* **Uniqueness:** It must ensure uniqueness.

### ⚙️ **Usage:**

* Any set of columns that can uniquely identify a record is considered a candidate key.
* The **primary key** is selected from these candidate keys.

### 💡 **Example:**

In a `Students` table, both `StudentID` and `Email` can act as candidate keys.

```sql
CREATE TABLE Students (
    StudentID INT,
    Email VARCHAR(100),
    Name VARCHAR(100),
    PRIMARY KEY (StudentID)  -- or Email could have been the primary key
);
```

---

## **5. Composite Key** 🧠

### 🔍 **Definition:**

A **Composite Key** is a primary key that consists of more than one column. It’s used when a single column is **insufficient** to uniquely identify a record.

* **Combination of Multiple Columns:** The combination of these columns ensures uniqueness.
* **Relational Integrity:** Used in tables where multiple attributes together define uniqueness (e.g., a `Student_Course` table linking students to courses).

### ⚙️ **Usage:**

* It’s common in **junction tables** (many-to-many relationships), where you need to reference two or more other tables.

### 💡 **Example:**

```sql
CREATE TABLE StudentCourses (
    StudentID INT,
    CourseID INT,
    EnrollmentDate DATE,
    PRIMARY KEY (StudentID, CourseID)
);
```

---

## **6. Super Key** 🔑

### 🔍 **Definition:**

A **Super Key** is any set of columns that **uniquely** identifies a record in a table. A super key can have **extra attributes** that aren’t necessary for uniqueness.

* **Superkey ≠ Candidate Key:** Every candidate key is a superkey, but not all superkeys are candidate keys.
* **Can be Redundant:** Superkeys may contain extra columns that are unnecessary for uniqueness.

### ⚙️ **Usage:**

* It’s useful for understanding that any combination of columns that includes the **primary key** (or is equivalent) qualifies as a super key.

### 💡 **Example:**

In a `Students` table, both `(StudentID)` and `(StudentID, Email)` are superkeys.

```sql
CREATE TABLE Students (
    StudentID INT,
    Name VARCHAR(100),
    Email VARCHAR(100),
    PRIMARY KEY (StudentID)
);
```

---

## **7. Alternate Key** 🔄

### 🔍 **Definition:**

An **Alternate Key** is any **candidate key** that is **not selected** as the **primary key**. Essentially, it’s a **secondary unique key**.

* **Candidate Keys:** All candidate keys are alternate keys except the primary key.
* **Optional:** Can be used to enforce uniqueness on columns that aren't primary keys.

### ⚙️ **Usage:**

* Used for enforcing uniqueness when another candidate key was chosen as the primary key.

### 💡 **Example:**

In the `Students` table above, if `Email` is not chosen as the primary key, it is considered an **alternate key**.

---

## **8. NULL Key** ❌

### 🔍 **Definition:**

A **NULL Key** is a key that can accept **NULL** values. Typically, `NULL` values are treated as **unknown** or **undefined**, so keys that allow them must handle this ambiguity.

* **Not usable in primary or unique keys** (because primary and unique keys enforce no `NULL` values).
* However, `NULL` values are allowed in certain situations, such as foreign keys or other non-primary constraints.

---

### **Summary of Key Differences**

| Key Type          | Uniqueness               | Nullability | Example Use Case                               |
| ----------------- | ------------------------ | ----------- | ---------------------------------------------- |
| **Primary Key**   | Unique                   | No          | Unique record identifier                       |
| **Foreign Key**   | Reference                | Yes         | Linking records between tables                 |
| **Unique Key**    | Unique                   | Yes         | Ensuring unique values, e.g., email, username  |
| **Candidate Key** | Unique                   | No          | Set of possible keys for a record              |
| **Composite Key** | Unique (multi-column)    | No          | Multi-column key in many-to-many relationships |
| **Super Key**     | Unique (can have extras) | Yes         | Any key set including primary key columns      |
| **Alternate Key** | Unique                   | No          | Non-primary candidate key                      |

---

### 🔥 Key Takeaways:

* **Primary Key**: The **unique identifier** for a record.
* **Foreign Key**: Links to another table’s **primary key** to create relationships.
* **Unique Key**: Enforces uniqueness, but can accept `NULL`.
* **Candidate Key**: A **potential primary key**.
* **Composite Key**: A primary key made of **multiple columns**.
* **Super Key**: Any set of columns that can uniquely identify a row, **but may include unnecessary attributes**.
* **Alternate Key**: A **non-primary candidate key**.

---


