''' *********** 7/10/2025
1.\tWrite a Groovy script that assigns a number to a variable, prints it, then changes it to a string and prints it again.
2.\tDeclare two variables x and X, assign different values, and print both in a formatted string.
3.\tUse dynamic typing to store and change the type of a variable three times (e.g., int → string → list) and print after each.
'''

class Exercises_11 {
    def var3 = 38
    def var4 = 1
    def methodo() {
       int var1 = 34

        println(var1)

        int var2 = var1.toInteger()
        println(var2)
    println(var3+var4)
    }

    static void main(args) {
        Exercises_11 oleg = new Exercises_11()
        // oleg is variable of TYPE exercises_1... then instantiating by calling constructor Exercise_1()
        oleg.methodo()
        oleg.var3 = "new type"
        oleg.var4 = 3434.53
        print("first one ${oleg.var3} and second ${oleg.var4}")
    }
}
