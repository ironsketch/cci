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

    def pal(self):
        stack = []
        tmp = self.headVal
        middle = math.ceil(self.size / 2) - 1
        for i in range(self.size):
            if(self.size % 2 == 1 and i == middle):
                break
            elif(i <= middle):
                stack.append(tmp.dataVal)
            elif(i > middle):
                if(stack.pop() != tmp.dataVal):
                    return False
            tmp = tmp.nextVal
        return True

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

def main():
    ll = LinkedList(7)
    ll.add(9)
    ll.add(33)
    ll.add(9)
    ll.add(7)
    dd = LinkedList(8)
    dd.add(3)
    dd.add(8)
    dd.add(4)

    print(ll.pal())
    print(dd.pal())

if __name__ == "__main__":
    main()
