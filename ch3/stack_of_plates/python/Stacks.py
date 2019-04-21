class Stacks:
    def __init__(self, stackSize):
        self.stacks = [[]]
        self.stackSize = stackSize

    def push(self, n):
        if(len(self.stacks[len(self.stacks) - 1]) == self.stackSize):
            self.stacks.append([])
            self.stacks[len(self.stacks) - 1].append(n)
        else:
            self.stacks[len(self.stacks) - 1].append(n)

    def pop(self):
        if(len(self.stacks[len(self.stacks) - 1]) == 0):
            self.stacks.pop()
        self.stacks[len(self.stacks) - 1].pop()

    def top(self):
        return self.stacks[len(self.stacks) - 1][len(self.stacks[len(self.stacks) - 1]) - 1]

    def p(self):
        for i in range(len(self.stacks)):
            for j in range(len(self.stacks[i])):
                print(self.stacks[i][j], end=" ")
            print("")
        print("")

def main():
    s = Stacks(5)
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.push(5)
    s.push(6)
    s.push(7)
    s.push(8)
    s.p()
    s.pop()
    s.pop()
    s.pop()
    s.pop()
    s.pop()
    s.pop()
    s.pop()
    s.p()

if __name__ == "__main__":
    main()
