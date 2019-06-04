def worstCase(l, n):
    for i in range(len(l)):
        if(l[i] == n):
            return i
    return -1

def better(l, n):

    i = 0
    while(i < len(l)):


def main():
    l = [15,16,19,20,25,1,3,4,5,7,10,14]
    print(worstCase(l,5))
    better(l,5)

if __name__ == "__main__":
    main()
