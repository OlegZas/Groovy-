''' 7/11/2025
4.\tUse arithmetic and logical operators to create an expression that evaluates to true with assert.
5.\tDemonstrate use of compound assignment (e.g., *=, +=) and verify the result with assert.
'''
'''
Concept\tPython\tGroovy
Function\tA standalone block of code, not tied to a class\tGroovy calls these "script methods" when defined outside of a class
Method\tA function defined inside a class\tSame in Groovy — a method inside a class
Instantiation\tFunctions don't require a class instance; methods do\tSame idea, unless method is static
'''
class Exercises_2_practice {
    def ramification = 34
    def captious = 86

    // it's necessary to define a method to run some operations
    def armethod() {
        ramification += 5
    assert ramification % captious != 0 // assert doesn't print anything, just evaluates to true or false(error will be shown) if assertion failed
    print(ramification)
    }

    // instantiate
        static void main(args) {
            //instantiate
            Exercises_2_practice ex2 = new Exercises_2_practice()
            ex2.armethod()

        }
    } // output: 39
