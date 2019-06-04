import sys

def diff(str1, str2):
    tmp = list(str2)
    count = 0
    for i in range(0, len(str1)):
        if str1[i] in tmp:
            count += 1
            tmp[tmp.index(str1[i])] = ' '
    return abs(count - min(len(str1), len(str2)))

def oneAway(str1, str2):
    count = abs(len(str1) - len(str2))
    if(str1 == str2):
        return True
    count += diff(str1, str2)
    if(count > 1):
        return False
    return True

def main():
    str1a = "pale"
    str1b = "ple"
    str2a = "pales"
    str3b = "bale"
    str4b = "bake"
    print(oneAway(str1a, str1b))
    print(oneAway(str2a, str1a))
    print(oneAway(str1a, str3b))
    print(oneAway(str1a, str4b))
    print(oneAway("mew", "meow"))

if __name__ == "__main__":
    main()
