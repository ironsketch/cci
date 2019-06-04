def mergeSort(a, b):
    i = 0
    j = 0
    newL = []
    while(i < len(a) - 1):
        if(j < len(b) and a[i]< b[j]):
            newL.append(a[i])
            i += 1
        if(j < len(b) and b[j] < a[i]):
            newL.append(b[j])
            j += 1
    while(i < len(a)):
        newL.append(a[i])
        i += 1
    while(j < len(b)):
        newL.append(b[j])
        j += 1
    return newL

def main():
    a = [1,2,3,6,7,15,17]
    b = [4,8,54,77]
    print(mergeSort(a, b))

if __name__ == "__main__":
    main()
