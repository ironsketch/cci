# Reminder: append and pop (pop returns item)
class Stack:
    def __init__(self):
        self.data = []

    def push(self, n):
        tmp = []
        if(len(self.data) == 0):
            self.data.append(n)
        else:
            while(len(self.data) > 0 and self.data[len(self.data) - 1] < n):
                tmp.append(self.data.pop())
            self.data.append(n)
            while(len(tmp) > 0):
                self.data.append(tmp.pop())

    def pop(self):
        self.data.pop()

    def peek(self):
        if(len(self.data) > 0):
            return self.data[len(self.data) - 1]

    def isEmpty(self):
        return (len(self.data) == 0)

def main():
    # Testing elements already put in order
    s = Stack()
    s.push(10); s.push(9); s.push(8); s.push(7); s.push(6)
    s.push(5); s.push(4); s.push(3); s.push(2); s.push(1)
    print(s.peek())

    # Testing elements in reverse order
    s2 = Stack()
    s2.push(1); s2.push(2); s2.push(3); s2.push(4); s2.push(5)
    s2.push(6); s2.push(7); s2.push(8); s2.push(9); s2.push(10)
    print(s2.peek())

    # Testing all the same elements
    s3 = Stack()
    s3.push(1); s3.push(1); s3.push(1); s3.push(1); s3.push(1)
    s3.push(1); s3.push(1); s3.push(1); s3.push(1); s3.push(1);
    print(s3.peek())

    # Testing just random numbers in random order
    s4 = Stack()
    s4.push(42); s4.push(333); s4.push(3); s4.push(12); s4.push(19)
    s4.push(2); s4.push(1983); s4.push(8); s4.push(12); s4.push(13)
    print(s4.peek())

    # Testing one element
    s5 = Stack()
    s5.push(22)
    print(s5.peek())

    # Testing no elements
    s6 = Stack()
    print(s6.peek())

if __name__ == "__main__":
    main()
