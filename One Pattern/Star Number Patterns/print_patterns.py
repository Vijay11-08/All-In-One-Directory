"""
25 classic star / number printing patterns (loops start from 1).
Run: python print_patterns.py [n]     # default n=5
"""

from __future__ import annotations

import sys


def sep(title: str) -> str:
    return f"\n{'=' * 60}\n{title}\n{'=' * 60}\n"


def square_hollow(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        if i == 1 or i == n:
            lines.append("*" * n)
        else:
            lines.append("*" + " " * (n - 2) + "*")
    return "\n".join(lines)


def number_triangle(n: int) -> str:
    """Centered: row i is digit i repeated i times."""
    lines: list[str] = []
    last_width = len(" ".join(str(n) for _ in range(n)))
    for i in range(1, n + 1):
        body = " ".join(str(i) for _ in range(i))
        pad = (last_width - len(body)) // 2
        lines.append(" " * pad + body)
    return "\n".join(lines)


def number_increasing_pyramid(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        lines.append(" ".join(str(j) for j in range(1, i + 1)))
    return "\n".join(lines)


def number_increasing_reverse_pyramid(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        k = n - i + 1
        lines.append(" ".join(str(j) for j in range(1, k + 1)))
    return "\n".join(lines)


def number_changing_pyramid(n: int) -> str:
    """Floyd-style: 1, then 2 3, then 4 5 6, ..."""
    cur = 1
    lines: list[str] = []
    for i in range(1, n + 1):
        parts: list[str] = []
        for _ in range(i):
            parts.append(str(cur))
            cur += 1
        lines.append(" ".join(parts))
    return "\n".join(lines)


def zero_one_triangle(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        start = 1 if i % 2 == 1 else 0
        row = [str((start + j) % 2) for j in range(i)]
        lines.append(" ".join(row))
    return "\n".join(lines)


def palindrome_triangle(n: int) -> str:
    lines: list[str] = []
    max_line = " ".join(
        str(x) for x in list(range(n, 0, -1)) + list(range(2, n + 1))
    )
    for i in range(1, n + 1):
        seq = list(range(i, 0, -1)) + list(range(2, i + 1))
        body = " ".join(str(x) for x in seq)
        pad = (len(max_line) - len(body)) // 2
        lines.append(" " * pad + body)
    return "\n".join(lines)


def rhombus_pattern(n: int) -> str:
    """Solid upright diamond (often labeled Rhombus in pattern sheets)."""
    return diamond_pattern(n)


def diamond_pattern(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        lines.append(" " * (n - i) + "*" * (2 * i - 1))
    for i in range(n - 1, 0, -1):
        lines.append(" " * (n - i) + "*" * (2 * i - 1))
    return "\n".join(lines)


def butterfly_pattern(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        lines.append("*" * i + " " * (2 * (n - i)) + "*" * i)
    for i in range(n, 0, -1):
        lines.append("*" * i + " " * (2 * (n - i)) + "*" * i)
    return "\n".join(lines)


def square_fill(n: int) -> str:
    return "\n".join("*" * n for _ in range(1, n + 1))


def right_half_pyramid(n: int) -> str:
    return "\n".join("*" * i for i in range(1, n + 1))


def reverse_right_half_pyramid(n: int) -> str:
    return "\n".join("*" * (n - i + 1) for i in range(1, n + 1))


def left_half_pyramid(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        lines.append(" " * (n - i) + "*" * i)
    return "\n".join(lines)


def reverse_left_half_pyramid(n: int) -> str:
    lines: list[str] = []
    for i in range(1, n + 1):
        k = n - i + 1
        lines.append(" " * (n - k) + "*" * k)
    return "\n".join(lines)


def k_pattern(n: int) -> str:
    """Letter K using stars; width 2n-1, height 2n-1."""
    w = 2 * n - 1
    lines: list[str] = []
    for i in range(1, 2 * n):
        row = [" "] * w
        row[0] = "*"
        if i <= n:
            right = w - i
        else:
            right = i - 1
        if 0 <= right < w:
            row[right] = "*"
        lines.append("".join(row).rstrip())
    return "\n".join(lines)


def triangle_star_pattern(n: int) -> str:
    """Centered solid triangle (top half of diamond)."""
    return "\n".join(" " * (n - i) + "*" * (2 * i - 1) for i in range(1, n + 1))


def reverse_number_triangle(n: int) -> str:
    """Each row: i..n, indented so block shifts right (reverse pyramid)."""
    lines: list[str] = []
    for i in range(1, n + 1):
        body = " ".join(str(j) for j in range(i, n + 1))
        lines.append(" " * (i - 1) + body)
    return "\n".join(lines)


def mirror_image_triangle(n: int) -> str:
    """Solid hourglass (mirror)."""
    lines: list[str] = []
    for i in range(n, 0, -1):
        lines.append(" " * (n - i) + "*" * (2 * i - 1))
    for i in range(2, n + 1):
        lines.append(" " * (n - i) + "*" * (2 * i - 1))
    return "\n".join(lines)


def hollow_triangle(n: int) -> str:
    """Centered hollow pyramid; bottom row is filled with stars (n stars)."""
    w = 2 * n - 1
    lines: list[str] = []
    for i in range(1, n + 1):
        if i == 1:
            lines.append("*".center(w))
        elif i == n:
            lines.append(" ".join("*" * n))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    return "\n".join(lines)


def hollow_reverse_triangle(n: int) -> str:
    """Inverted hollow pyramid (mirror of hollow_triangle)."""
    w = 2 * n - 1
    lines: list[str] = []
    for i in range(n, 0, -1):
        if i == n:
            lines.append(" ".join("*" * n))
        elif i == 1:
            lines.append("*".center(w))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    return "\n".join(lines)


def hollow_diamond_pyramid(n: int) -> str:
    """Hollow diamond — widest row is two edge stars only."""
    w = 2 * n - 1
    lines: list[str] = []
    for i in range(1, n + 1):
        if i == 1:
            lines.append("*".center(w))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    for i in range(n - 1, 0, -1):
        if i == 1:
            lines.append("*".center(w))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    return "\n".join(lines)


def hollow_hourglass(n: int) -> str:
    """Hollow outline hourglass."""
    w = 2 * n - 1
    lines: list[str] = []
    for i in range(n, 0, -1):
        if i == n:
            lines.append(" ".join("*" * n))
        elif i == 1:
            lines.append("*".center(w))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    for i in range(2, n + 1):
        if i == n:
            lines.append(" ".join("*" * n))
        elif i == 1:
            lines.append("*".center(w))
        else:
            inner = 2 * i - 3
            lines.append(("*" + " " * inner + "*").center(w))
    return "\n".join(lines)


def pascal_triangle(n: int) -> str:
    rows: list[list[int]] = []
    for i in range(1, n + 1):
        row = [1]
        if i > 1:
            prev = rows[-1]
            for j in range(1, len(prev)):
                row.append(prev[j - 1] + prev[j])
            row.append(1)
        rows.append(row)
    width = len(" ".join(str(x) for x in rows[-1]))
    out: list[str] = []
    for row in rows:
        body = " ".join(str(x) for x in row)
        pad = (width - len(body)) // 2
        out.append(" " * pad + body)
    return "\n".join(out)


def right_pascal_triangle(n: int) -> str:
    """Pascal rows left-aligned (right-pointing triangle of numbers)."""
    rows: list[list[int]] = []
    for i in range(1, n + 1):
        row = [1]
        if i > 1:
            prev = rows[-1]
            for j in range(1, len(prev)):
                row.append(prev[j - 1] + prev[j])
            row.append(1)
        rows.append(row)
    return "\n".join(" ".join(str(x) for x in row) for row in rows)


PATTERNS: list[tuple[str, object]] = [
    ("01 Square Hollow Pattern", square_hollow),
    ("02 Number Triangle", number_triangle),
    ("03 Number Increasing Pyramid", number_increasing_pyramid),
    ("04 Number Increasing Reverse Pyramid", number_increasing_reverse_pyramid),
    ("05 Number Changing Pyramid", number_changing_pyramid),
    ("06 Zero-One Triangle", zero_one_triangle),
    ("07 Palindrome Triangle", palindrome_triangle),
    ("08 Rhombus Pattern", rhombus_pattern),
    ("09 Diamond Pattern", diamond_pattern),
    ("10 Butterfly Star Pattern", butterfly_pattern),
    ("11 Square Fill Pattern", square_fill),
    ("12 Right Half Pyramid", right_half_pyramid),
    ("13 Reverse Right Half Pyramid", reverse_right_half_pyramid),
    ("14 Left Half Pyramid", left_half_pyramid),
    ("15 Reverse Left Half Pyramid", reverse_left_half_pyramid),
    ("16 K Pattern", k_pattern),
    ("17 Triangle Star Pattern", triangle_star_pattern),
    ("18 Reverse Number Triangle Pattern", reverse_number_triangle),
    ("19 Mirror Image Triangle Pattern", mirror_image_triangle),
    ("20 Hollow Triangle Pattern", hollow_triangle),
    ("21 Hollow Reverse Triangle Pattern", hollow_reverse_triangle),
    ("22 Hollow Diamond Pyramid", hollow_diamond_pyramid),
    ("23 Hollow Hourglass Pattern", hollow_hourglass),
    ("24 Pascal's Triangle", pascal_triangle),
    ("25 Right Pascal's Triangle", right_pascal_triangle),
]


def main() -> None:
    n = int(sys.argv[1]) if len(sys.argv) > 1 else 5
    for name, fn in PATTERNS:
        print(sep(name))
        print(fn(n))  # type: ignore[operator]


if __name__ == "__main__":
    main()
