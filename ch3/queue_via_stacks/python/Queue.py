class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, n):
        tmp = []
        for i in range(len(self.queue)):
            tmp.append(self.queue.pop())
        self.queue.append(n)
        for i in range(len(tmp)):
            self.queue.append(tmp.pop())

    def dequeue(self):
        return self.queue.pop()

    def p(self):
        for i in range(len(self.queue)):
            print(self.queue[i], end=" ")
        print("")

def main():
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(5)
    q.enqueue(6)
    q.enqueue(7)

    q.p()

    q.dequeue()

    q.p()

if __name__ == "__main__":
    main()
