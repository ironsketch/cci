import sys
import numpy as np

def zero(arr, col, row):
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            if i == col:
                arr[i][j] = 0
            if j == row:
                arr[i][j] = 0

def zeroMatrix(arr):
    tmp = arr.copy()
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            if arr[i][j] == 0:
                zero(tmp, i , j)
    return tmp

def printArr(arr):
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            print("%3d" % (arr[i][j]), end="")
        print("\n")
    print("\n")

def main():
    if(len(sys.argv) != 3):
        print("Usage: $ python zeroMatrix.py col row")
    else:
        begin = np.random.randint((int(sys.argv[1]) * int(sys.argv[2])) / 10, size=(int(sys.argv[1]),int(sys.argv[2])))
        printArr(begin)
        newArr = zeroMatrix(begin)
        printArr(newArr)


if __name__ == "__main__":
    main()
