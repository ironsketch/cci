def setArrSize(row, col):
    tmp = []
    for i in range (0, col):
        for j in range (0, row):
            tmp[i][j].append(0)
    return tmp

def rotate(arr):
    tmp = setArrSize(len(arr[0]), len(arr))
    for i in range(0, len(arr)):
        for j in range(len(arr[0]), 0, -1):
            tmp[abs(len(arr[0]) - j)] = arr[i][j]
    return tmp

def main():
    rotateMe = [[0,1,2,3],[4,5,6,7],[8,9,10,11]]
    print(rotate(rotateMe))

if __name__ == "__main__":
    main()
