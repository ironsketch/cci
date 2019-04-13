import math

class Node:
    def __init__(self, dataVal = None):
        self.dataVal = dataVal
        self.nextVal = None

class LinkedList:
    def __init__(self, n):
        self.headVal = Node(n)
        self.size = 1

    def add(self, n):
        tmpNew = Node(n)
        tmp = self.headVal
        while(tmp.nextVal != None):
            tmp = tmp.nextVal
        tmp.nextVal = tmpNew
        self.size += 1

    def remove(self, n):
        tmp = self.headVal
        while(n - 1 > 0):
            tmp = tmp.nextVal
            n -= 1
        tmp.nextVal = tmp.nextVal.nextVal
        self.size -= 1

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

    def inter(self, ll):
        ith = self.headVal
        jth = ll.headVal
        for i in range(self.size):
            for j in range(ll.size):
                if(ith == jth):
                    return True
                jth = jth.nextVal
            ith = ith.nextVal
        return False

def main():
    dd = LinkedList(8)
    dd.add(3)
    dd.add(8)
    dd.add(4)

if __name__ == "__main__":
    main()
