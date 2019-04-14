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
        self.size -= 1
        tmp.nextVal = tmp.nextVal.nextVal

    def swap(self, n1, n2):
        tmp = n1.dataVal
        n1.dataVal = n2.dataVal
        n2.dataVal = tmp

    def part(self, p):
        tmp = self.headVal
        count = 0
        for i in range(self.size):
            if(tmp.nextVal.dataVal >= p):
                self.add(tmp.nextVal.dataVal)
                self.size -= 1
                tmp.nextVal = tmp.nextVal.nextVal
            else:
                tmp = tmp.nextVal
        tmp = self.headVal
        if(tmp.dataVal >= p):
            self.add(tmp.dataVal)
            self.size -= 1
            self.headVal = tmp.nextVal

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

def main():
    ll = LinkedList(33)
    ll.add(2)
    ll.add(75)
    ll.add(5)
    ll.add(1)
    ll.add(100)
    ll.add(0)
    ll.p()
    ll.part(5)
    ll.p()

if __name__ == "__main__":
    main()
