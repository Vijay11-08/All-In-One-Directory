def butterfly_pattern(n):
    # Upper half
    for i in range(1, n + 1):
        print("*" * i + " " * (2 * (n - i)) + "*" * i)
    # Lower half
    for i in range(n, 0, -1):
        print("*" * i + " " * (2 * (n - i)) + "*" * i)

if __name__ == "__main__":
    n = 5
    butterfly_pattern(n)
