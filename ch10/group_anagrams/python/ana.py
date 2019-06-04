def isPal(s):
    for i in range(len(s)/2):
        if(s[i] != s[len(s) - 1 - i]):
            return False
    return True

def ana(l):
    pal = []
    notpal = []
    for word in l:
        if(isPal(word)):
            pal.append(word)
        else:
            notpal.append(word)
    return pal + notpal

def main():
    a = ["aabbaa", "cat", "boob"]
    b = ["hardydrah", "baab"]
    c = ["dog", "cat", "dumb"]
    d = []
    print(ana(a))
    print(ana(b))
    print(ana(c))
    print(ana(d))

if __name__ == "__main__":
    main()
