from Node import *

class Tree:
    def __init__(self, d):
        self.head = Node(d)

    def insert(self, d):
        newNode = Node(d)
        tmpHead = self.head
        while(tmpHead != None):
            if(newNode.data < tmpHead.data):
                if(tmpHead.left == None):
                    tmpHead.left = newNode
                    break
                else:
                    tmpHead = tmpHead.left
            elif(newNode.data > tmpHead.data):
                if(tmpHead.right == None):
                    tmpHead.right = newNode
                    break
                tmpHead = tmpHead.right
        tmpHead = newNode

    def preList(self):
        return self.preListR(self.head)

    def preListR(self, n):
        if(n.left == ):


    def p(self):
        tmpHead = self.head
        self.pR(tmpHead)

    def pR(self, n):
        if(n != None):
            print(n.data)
        if(n.left != None):
            self.pR(n.left)
        if(n.right != None):
            self.pR(n.right)
