import time

class Animals():
    def __init__(self, name, date = int(time.time())):
        self.name = name
        self.date = date
