class Stack:

    def __init__(self):
        self.data = []

    def push(self, n):
        if(len(self.data) > 0 and n < self.data[0]):
            self.data.insert(0, n)
        else:
            self.data.append(n)

    def pop(self):
        self.data.pop()

    def min(self):
        return self.data[0]
