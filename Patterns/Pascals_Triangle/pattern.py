def pascals_triangle(n):
    for i in range(n):
        print(" " * (n - i), end="")
        c = 1
        for j in range(i + 1):
            print(c, end=" ")
            c = c * (i - j) // (j + 1)
        print()

if __name__ == "__main__":
    n = 5
    pascals_triangle(n)
