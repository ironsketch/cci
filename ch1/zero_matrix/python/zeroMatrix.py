import sys
import numpy as np

# Zero the ith column and jth row
def zero(arr, col, row):
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            if i == col:
                arr[i][j] = 0
            if j == row:
                arr[i][j] = 0

def zeroMatrix(arr):
    # Copy the array! Or else you zero the whole thing out
    tmp = arr.copy()

    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            if arr[i][j] == 0:
                # I found a zero! now i need to zero out the ith column and jth row
                zero(tmp, i , j)
    # Return new array
    return tmp

# Print the array
def printArr(arr):
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            print("%3d" % (arr[i][j]), end="")
        print("\n")
    print("\n")

def main():
    # Check for proper Usage
    if(len(sys.argv) != 3):
        print("Usage: $ python zeroMatrix.py col row")
    else:
        # Create a new random array (list)
        begin = np.random.randint((int(sys.argv[1]) * int(sys.argv[2])) / 10, size=(int(sys.argv[1]),int(sys.argv[2])))
        # Print the list before
        printArr(begin)
        # Zero that array out
        newArr = zeroMatrix(begin)
        # Print result
        printArr(newArr)


if __name__ == "__main__":
    main()
