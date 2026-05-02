def inverted_right_half_pyramid(n):
    for i in range(n, 0, -1):
        print("*" * i)

if __name__ == "__main__":
    n = 5
    inverted_right_half_pyramid(n)
