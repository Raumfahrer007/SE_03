def black_box_function(): #Local Scope
    x = 42
    print("Only I can see what's inside here: It's " + str(x))


def interrogation_room(): #Enclosing (Nonlocal) Scope
    perpetrator = "Carl"
    print("My name is " + perpetrator + " and I can only see a mirror")

    def one_way_mirror():
        inspector = "Hank"
        print("My name is " + inspector + " and I can see " + perpetrator)
    
    def second_one_way_mirror():
        print("But that's not his real name, so let me change that.")
        nonlocal perpetrator
        perpetrator = "Karl"

    one_way_mirror()
    second_one_way_mirror()
    print("The perpetrator's real name is " + perpetrator)


def house_with_windows():
    print("I can see the weather outside is " + weather)


def final_instance():
    print("When no one else knows the variable, it's my turn")


print("Local Scope")
black_box_function()

print("---\nEnclosing Scope")
interrogation_room()

print("---\nGlobal Scope")
weather = "nice"
house_with_windows()

print("---\nBuilt-in Scope")
final_instance()