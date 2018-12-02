import sys

def isUnique(str):
    for i in range (0, len(str)):
        for j in range (i + 1, len(str)):
            if(str[i] == str[j]):
                return False
    return True

def main():
    if len(sys.argv) < 2:
        print("Use: $ python isunique.py word1 word2 word3 etc")
    else:
        for arg in sys.argv[1:]:
            print(isUnique(arg))

if __name__ == "__main__":
    main()
