import sys

def URLify(str):
    tmp = ""
    count = 0
    for i in range (0, len(str)):
        if(str[i] == ' '):
            tmp += str[count : i] + "%20"
            count = i+1
    tmp += str[count : len(str)]
    str = tmp
    print str

def main():
    if(len(sys.argv) < 2):
        print("Usage: $ python urlify.py word1 word2 word3 etc")
    else:
        for arg in sys.argv[1:]:
            URLify(arg)

if __name__ == "__main__":
    main()
