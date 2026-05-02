def alphabet_right_half_pyramid(n):
    for i in range(1, n + 1):
        char = chr(64 + i)
        print(char * i)

if __name__ == "__main__":
    n = 5
    alphabet_right_half_pyramid(n)
