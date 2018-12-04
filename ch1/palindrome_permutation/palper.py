import sys

def tostring(word):
    return ''.join(word)

def isPal(word):
    tmp = tostring(word).replace(" ","")
    if(tmp == tmp[::-1]):
        return True
    else:
        return False

def permute(word, l, r):
    if word == '':
        return "You sent me an empty string"
    if l == r and len(word) == 1:
        return word
    else:
        if l == r and isPal(word):
            print(tostring(word))
        else:
            for i in range(l, r):
                word[l], word[i] = word[i], word[l]
                permute(word, l + 1, r)
                word[l], word[i] = word[i], word[l]

def main():
    for arg in sys.argv[1:]:
        permute(list(arg), 0, len(arg))

if __name__ == "__main__":
    main()
