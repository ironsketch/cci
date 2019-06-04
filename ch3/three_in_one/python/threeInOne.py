class Stacks:
    def __init__(self):
        self.data = []

    def push(self, stack, n):
        self.data.append((stack, n))

    def pop(self, stack):
        for i in range(len(self.data) - 1, -1, -1):
            if(self.data[i][0] == stack):
                self.data.pop(i)
                return

    def top(self, stack):
        for i in range(len(self.data) - 1, -1, -1):
            if(self.data[i][0] == stack):
                return self.data[i]

    def p(self, stack):
        for i in range(len(self.data)):
            if(self.data[i][0] == stack):
                print(self.data[i][1], end=" ")
        print("")

def main():
    s = Stacks()
    s.push(1, 4)
    s.push(1, 5)
    s.push(1, 6)
    s.push(2, 33)
    s.push(2, 44)
    s.push(2, 55)
    s.push(2, 66)
    s.push(1, 7)
    s.push(1, 8)
    s.push(3, 1984)

    s.p(1)
    s.p(2)
    s.p(3)

    print("")

    print(s.top(1))
    s.pop(1)
    print(s.top(2))
    s.pop(2)
    print(s.top(3))
    s.pop(3)

    print("")

    s.p(1)
    s.p(2)
    s.p(3)

if __name__ == "__main__":
    main()
