import sys
import numpy as np

def zeroMatrix(arr):
    listOfLoc = getZeroLoc(arr)
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if(i in listOfLoc[0] or j in listOfLoc[1]):
                arr[i][j] = 0


def getZeroLoc(arr):
    locate = [[],[]]
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if(arr[i][j] == 0):
                locate[0].append(i)
                locate[1].append(j)
    return locate

def create(i, j):
    a = np.random.randint((i * j) / 2, size = (i, j))
    return a

def p(arr):
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            print(str(arr[i][j]) + " ", end="")
        print("")
    print("")

def main():
    # Check for proper Usage
    if(len(sys.argv) != 3):
        print("Usage: $ python zeroMatrix.py col row")
    else:
        a = create(int(sys.argv[1]), int(sys.argv[2]))
        p(a)
        zeroMatrix(a)
        p(a)

if __name__ == "__main__":
    main()
