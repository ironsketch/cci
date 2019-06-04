import sys

def stringRotation(word1, word2):
    for i in range(0, len(word2)):
        if word1 == word2:
            return True
        else:
            word2 = word2[1:len(word2)] + word2[0]
    return False

def main():
    if len(sys.argv) < 1:
        print("Usage: $ python stringRotation.py word1 word2")
    else:
        print(stringRotation(sys.argv[1], sys.argv[2]))

if __name__ == "__main__":
    main()
