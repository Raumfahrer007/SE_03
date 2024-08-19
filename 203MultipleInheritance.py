class Cow:
    def giveMilk(self):
        print("Gives milk")

    def walk(self):
        print("Cow walks")


class Chicken:
    def layEgg(self):
        print("Lays Egg")

    def walk(self):
        print("Chicken walks")

class Eierlegendewollmilchsau(Cow, Chicken):
    pass

#Multiple Inheritance
eierlegendewollmilchsau = Eierlegendewollmilchsau()
eierlegendewollmilchsau.giveMilk()
eierlegendewollmilchsau.layEgg()

#Ducktyping Example
animals = [Cow(), Chicken()]
for animal in animals:
    animal.walk()