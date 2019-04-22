import queue
import sys
from Cats import *
from Dogs import *

class Shelter():
    def __init__(self):
        self.dogs = queue.Queue(50)
        self.cats = queue.Queue(50)

    def enqueueCat(self, newPet):
        self.cats.put(newPet)

    def enqueueDog(self, newPet):
        self.dogs.put(newPet)

    def dequeueCat(self):
        if(not self.cats.empty()):
            return self.cats.get()

    def dequeueDog(self):
        if(not self.dogs.empty()):
            return self.dogs.get()

    def dequeueAny(self):
        if(not self.dogs.empty() and self.dogs.queue[0].date < self.cats.queue[0].date):
            return self.dogs.get()
        elif(not self.cats.empty()):
            return self.cats.get()

def main():
    shelter = Shelter()
    while(True):
        choice = int(input("Enter a cat, dog, adopt or exit (1,2,3,4)\n"))
        if(choice == 1):
            name = input("What's the cat's name?\n")
            newCat = Cats(name)
            shelter.enqueueCat(newCat)
        elif(choice == 2):
            name = input("What's the dog's name?\n")
            newDog = Dogs(name)
            shelter.enqueueDog(newDog)
        elif(choice == 3):
            choice = int(input("Adopt a cat, dog or either?(1, 2, 3)\n"))
            if(choice == 1):
                adoptedCat = shelter.dequeueCat()
                print("You adopted ", adoptedCat.name)
            elif(choice == 2):
                adoptedDog = shelter.dequeueDog()
                print("You adopted ", adoptedDog.name)
            elif(choice == 3):
                adoptedAnimal = shelter.dequeueAny()
                print("You adopted ", adoptedAnimal.name)
        elif(choice == 4):
            sys.exit()
        else:
            print("Pfft that wasn't even a choice!")

if __name__ == "__main__":
    main()
