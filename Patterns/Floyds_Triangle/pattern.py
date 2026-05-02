def floyds_triangle(n):
    num = 1
    for i in range(1, n + 1):
        for j in range(i):
            print(num, end=" ")
            num += 1
        print()

if __name__ == "__main__":
    n = 5
    floyds_triangle(n)
