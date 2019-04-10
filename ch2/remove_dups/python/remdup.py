class Node:
    def __init__(self, dataVal = None):
        self.dataVal = dataVal
        self.nextVal = None

class LinkedList:
    def __init__(self, n):
        self.headVal = Node(n)

    def add(self, n):
        tmpNode = Node(n)
        tmp = self.headVal
        while(tmp.nextVal != None):
            tmp = tmp.nextVal
        tmp.nextVal = tmpNode

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

    def remDups(self):
        l = list()
        tmp = self.headVal
        l.append(tmp.dataVal)
        while(tmp.nextVal.nextVal != None):
            if(tmp.nextVal.dataVal not in l):
                l.append(tmp.nextVal.dataVal)
            else:
                tmp.nextVal = tmp.nextVal.nextVal
            tmp = tmp.nextVal
        if(tmp.nextVal.dataVal in l):
            tmp.nextVal = None

ll = LinkedList(0)
ll.add(1)
ll.add(2)
ll.add(3)
ll.add(1)
ll.add(4)
ll.add(5)
ll.add(66)
ll.add(42)
ll.add(9)
ll.add(100)
ll.add(100)
ll.add(7)
ll.add(7)
ll.add(7)
ll.add(7)
ll.add(7)
ll.p()
ll.remDups()
ll.p()

