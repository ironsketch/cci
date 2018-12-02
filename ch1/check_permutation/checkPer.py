import sys

def checkPermutations(str1, str2):
    if(len(str1) != len(str2)):
        return False
    else:
        for c in str1:
            if(str1.count(c) != str2.count(c)):
                return False
    return True

def main():
    if(len(sys.argv) != 3):
        print("Usage: $ python checkPer.py word1 word2")
    else:
        print(checkPermutations(sys.argv[1], sys.argv[2]))

if __name__ == "__main__":
    main()
