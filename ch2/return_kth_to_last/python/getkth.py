class Node:
    def __init__(self, dataVal = None):
        self.dataVal = dataVal
        self.nextVal = None

class LinkedList:
    def __init__(self, n):
        self.headVal = Node(n)
        self.size = 1

    def getSize(self):
        return self.size

    def add(self, n):
        tmpNode = Node(n)
        tmp = self.headVal
        while(tmp.nextVal != None):
            tmp = tmp.nextVal
        tmp.nextVal = tmpNode
        self.size += 1

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

    def getkth(self, n):
        count = self.size - 1 - n
        tmp = self.headVal
        if(count < 0):
            return -1
        else:
            while(count > 0):
                tmp = tmp.nextVal
                count -= 1
        return tmp.dataVal

ll = LinkedList(0)
ll.add(5)
ll.add(7)
ll.add(7)
ll.add(4)
ll.add(55)
ll.add(666)
ll.add(42)
ll.add(42)
ll.add(42)
ll.add(42)
ll.add(42)
ll.add(42)
ll.add(2)
ll.add(1)
print("The size of my LinkedList is " + str(ll.getSize()))
print(ll.getkth(0))
print(ll.getkth(14))

ll2 = LinkedList(4)
print("The size of my LinkedList is " + str(ll2.getSize()))
print(ll2.getkth(0))
print(ll2.getkth(14))
