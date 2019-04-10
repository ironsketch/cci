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

    def number(self):
        count = 0
        tmp = self.headVal
        for i in range(self.size):
            count += tmp.dataVal * 10**i
            tmp = tmp.nextVal
        return count

    def sum2(self, ll):
        return self.number() + ll.number()

    def p(self):
        tmp = self.headVal
        while(tmp.nextVal != None):
            print(tmp.dataVal, end=" ")
            tmp = tmp.nextVal
        print(tmp.dataVal)

def main():
    ll = LinkedList(7)
    ll.add(1)
    ll.add(6)
    ll2 = LinkedList(5)
    ll2.add(9)
    ll2.add(2)

    print(ll.sum2(ll2))

if __name__ == "__main__":
    main()
