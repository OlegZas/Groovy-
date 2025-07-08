'''An Interface 
 - is a blueprint for classes used to define common behavior across classes.
 - It defines what methods a class must implement, but not how those methods should work.
 - only has method signatures, no body
 - no instance variables unless static final
 - class can implement multiple interface, but only extend one class
 -  every method is public and abstract
  '''

''' Use when 
1. implementation of functoins or methods is unknown 

'''
interface a22_Interfaceclass {
    def notion();
    def cellar();
    def quiver();
}


'''
interface Animal {
    void speak()
    void eat()
}

class Dog implements Animal {
    void speak() {
        println "Woof!"
    }

    void eat() {
        println "Dog is eating."
    }
}

def myPet = new Dog()
myPet.speak() // Woof!
myPet.eat()   // Dog is eating.
'''