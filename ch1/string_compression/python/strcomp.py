def stringComp(a):
    tmp = ""
    count = 1
    for i in range (len(a) - 1):
        if(a[i] == a[i + 1]):
            count += 1;
        else:
            tmp += a[i] + str(count)
            count = 1
    return tmp

def main():
    a = "aabcccccaaa"
    b = "abc"
    print(stringComp(a))

if __name__ == "__main__":
    main()
