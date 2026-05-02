def inverted_number_right_half_pyramid(n):
    for i in range(n, 0, -1):
        for j in range(1, i + 1):
            print(j, end=" ")
        print()

if __name__ == "__main__":
    n = 5
    inverted_number_right_half_pyramid(n)
