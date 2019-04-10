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
        isUnique = []
        tmp = self.headVal
        isUnique.append(tmp.dataVal)
        while(tmp.nextVal != None):
            if(tmp.nextVal.dataVal not in isUnique):
                isUnique.append(tmp.nextVal.dataVal)
                tmp = tmp.nextVal
            else:
                while(tmp.nextVal != None and tmp.nextVal.dataVal in isUnique):
                    tmp.nextVal = tmp.nextVal.nextVal

ll = LinkedList(0)
ll.add(0)
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
ll.add(1)
ll.add(1)
ll.p()
ll.remDups()
ll.p()
