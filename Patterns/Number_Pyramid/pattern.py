def number_pyramid(n):
    for i in range(1, n + 1):
        print(" " * (n - i), end="")
        for j in range(1, i + 1):
            print(i, end=" ")
        print()

if __name__ == "__main__":
    n = 5
    number_pyramid(n)
