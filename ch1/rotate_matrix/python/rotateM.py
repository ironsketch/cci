import numpy as np

def rotate(arr):
    tmp = np.zeros((len(arr), len(arr[0])), dtype=np.int32)
    for i in range(0, len(arr)):
        for j in range(0, len(arr[0])):
            tmp[i, abs(len(arr[0]) - j - 1)] = arr[i][j]
    return tmp

def main():
    rotateMe = [[0,1,2,3],[4,5,6,7],[8,9,10,11]]
    print(rotate(rotateMe))

if __name__ == "__main__":
    main()
