
---

## ⭐ **Star & number printing patterns** (like your 5×5 reference chart)

Console patterns used in **Python / Java** courses and interviews. **All loops are written starting from `1`** (e.g. `for i in range(1, n + 1)` and `for (int i = 1; i <= n; i++)`).

| # | Name |
| - | ---- |
| 1 | Square Hollow Pattern |
| 2 | Number Triangle (row *i* = digit *i* repeated *i* times, centered) |
| 3 | Number Increasing Pyramid (`1` … `1 2 3 … i`) |
| 4 | Number Increasing Reverse Pyramid (inverted) |
| 5 | Number Changing Pyramid (Floyd: `1`, `2 3`, `4 5 6`, …) |
| 6 | Zero–One Triangle |
| 7 | Palindrome Triangle |
| 8 | Rhombus Pattern (here: same solid diamond as many tutorial sheets) |
| 9 | Diamond Pattern |
| 10 | Butterfly Star Pattern |
| 11 | Square Fill Pattern |
| 12 | Right Half Pyramid |
| 13 | Reverse Right Half Pyramid |
| 14 | Left Half Pyramid |
| 15 | Reverse Left Half Pyramid |
| 16 | K Pattern |
| 17 | Triangle Star Pattern (centered) |
| 18 | Reverse Number Triangle Pattern |
| 19 | Mirror Image Triangle Pattern (solid hourglass) |
| 20 | Hollow Triangle Pattern |
| 21 | Hollow Reverse Triangle Pattern |
| 22 | Hollow Diamond Pyramid |
| 23 | Hollow Hourglass Pattern |
| 24 | Pascal’s Triangle (centered) |
| 25 | Right Pascal’s Triangle (left-aligned rows) |

---

## 🖼️ **Reference image**

The original **5×5 grid** you used is saved here as:

`pattern-reference-chart.png` (same folder as this file)

Open it side by side with the code when you practice.

---

## ▶️ **How to run**

**Python** (prints all 25 for size `n`; default `n=5`):

```text
python print_patterns.py
python print_patterns.py 4
```

**Java** (compile once, then run):

```text
javac PrintPatterns.java
java PrintPatterns
java PrintPatterns 4
```

Each program prints every pattern in order with a title bar. Read the source: every pattern is a **named function** you can copy into a smaller file or IDE.

---

## 📁 **Files**

| File | Role |
| ---- | ---- |
| `print_patterns.py` | All 25 patterns in Python |
| `PrintPatterns.java` | Same 25 in Java (Java 8+ friendly) |
| `pattern-reference-chart.png` | Your reference grid |
| `README.md` | This page |

---

## 🔢 **“Starting from 1”**

- **Control variable** `i` (and `j` where used) runs **`1 .. n`** in both languages.  
- **Number patterns** that count (Floyd, increasing pyramids, Pascal rows) also **start values from 1** where the chart does.

---
