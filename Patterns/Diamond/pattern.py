def diamond_pattern(n):
    # Upper half
    for i in range(1, n + 1):
        print(" " * (n - i), end="")
        print("*" * (2 * i - 1))
    # Lower half
    for i in range(n - 1, 0, -1):
        print(" " * (n - i), end="")
        print("*" * (2 * i - 1))

if __name__ == "__main__":
    n = 5
    diamond_pattern(n)
