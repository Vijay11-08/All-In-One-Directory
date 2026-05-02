def inverted_full_pyramid(n):
    for i in range(n, 0, -1):
        print(" " * (n - i), end="")
        print("*" * (2 * i - 1))

if __name__ == "__main__":
    n = 5
    inverted_full_pyramid(n)
