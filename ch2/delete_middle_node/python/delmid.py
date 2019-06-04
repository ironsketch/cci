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

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

def main():
    ll = LinkedList(0)
    ll.add(1)
    ll.add(2)
    ll.add(3)
    ll.add(4)
    ll.add(5)
    ll.add(6)
    ll.p()
    ll.remove(3)
    ll.p()

if __name__ == "__main__":
    main()
