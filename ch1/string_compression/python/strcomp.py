def stringComp(a):
    tmp = ""
    if(a == ""):
        return ""
    count = 1
    for i in range (len(a) - 1):
        if(a[i] == a[i + 1]):
            count += 1;
        else:
            tmp += a[i] + str(count)
            count = 1
    tmp += a[len(a) - 1] + str(count)
    return tmp

def main():
    a = "aabcccccaaa"
    b = "abc"
    c = "ggggggggggggggggggggggggggggggggggg"
    d = "aaabbbcdddddddddddddddddddddde"
    e = ""
    print(stringComp(a))
    print(stringComp(b))
    print(stringComp(c))
    print(stringComp(d))
    print(stringComp(e))

if __name__ == "__main__":
    main()
