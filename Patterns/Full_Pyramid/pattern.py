def full_pyramid(n):
    for i in range(1, n + 1):
        # Print leading spaces
        print(" " * (n - i), end="")
        # Print stars
        print("*" * (2 * i - 1))

if __name__ == "__main__":
    n = 5
    full_pyramid(n)
