
---

### ✅ **1. What is the difference between `==` and `===` in JavaScript?**

* `==` (Loose Equality): Compares **values** after performing **type coercion**.

  ```js
  "5" == 5 // true
  ```

* `===` (Strict Equality): Compares **both value and type** without coercion.

  ```js
  "5" === 5 // false
  ```

👉 **Use `===`** for safer and more predictable comparisons.

---

### ✅ **2. Explain how the Virtual DOM works in React.**

* The **Virtual DOM (VDOM)** is a lightweight JavaScript representation of the real DOM.
* When the state changes, React:

  1. Creates a new Virtual DOM.
  2. **Diffs** it with the previous VDOM.
  3. Finds the **minimal changes**.
  4. **Updates** only the changed parts in the real DOM (efficient and fast).

👉 This makes React applications fast and responsive.

---

### ✅ **3. What are React Hooks? Name a few commonly used ones.**

* **Hooks** let you use state and lifecycle methods in **functional components**.
* Commonly used Hooks:

  * `useState()` – to manage state.
  * `useEffect()` – for side effects like API calls.
  * `useContext()` – to use context API.
  * `useRef()` – to access DOM elements or persist values.
  * `useMemo()` – for performance optimization.

👉 Hooks help make components cleaner and more reusable.

---

### ✅ **4. How would you optimize the performance of a React application?**

1. **Use `React.memo()`** to avoid unnecessary re-renders.
2. **Split code** using lazy loading (`React.lazy`, `Suspense`).
3. Use **`useMemo()` and `useCallback()`** to memoize values/functions.
4. Avoid large re-renders by **lifting state** appropriately.
5. Implement **pagination/infinite scroll** for large lists.
6. Optimize images, CSS, and JavaScript files.
7. Use a **Content Delivery Network (CDN)** and **caching**.

---

### ✅ **5. What is the difference between state and props in React?**

| Feature    | Props                                | State                                      |
| ---------- | ------------------------------------ | ------------------------------------------ |
| Definition | Data passed **from parent to child** | Data **managed inside a component**        |
| Mutability | **Read-only**                        | **Mutable** using `setState` or `useState` |
| Usage      | Customize child components           | Track dynamic data within a component      |

👉 **Props = External inputs**, **State = Internal data**.

---

### ✅ **6. How does CSS Flexbox differ from Grid Layout?**

| Feature  | Flexbox                               | Grid                                       |
| -------- | ------------------------------------- | ------------------------------------------ |
| Axis     | **One-dimensional** (row OR column)   | **Two-dimensional** (row AND column)       |
| Use Case | Best for aligning items in a **line** | Best for **layouts** with rows and columns |
| Example  | Navigation bars, item alignment       | Complex page layouts                       |

👉 Use **Flexbox for alignment**, **Grid for layout**.

---

### ✅ **7. What is a Single Page Application (SPA) and how does it work?**

* A **SPA** is a web app that **loads a single HTML page** and updates content dynamically **without refreshing the entire page**.
* Uses **AJAX / Fetch API** and **JavaScript frameworks (like React, Angular)** to handle routing on the client side.
* Improves user experience with **faster navigation and reduced server load**.

👉 Example: Gmail, Facebook, or any React-based app.

---

