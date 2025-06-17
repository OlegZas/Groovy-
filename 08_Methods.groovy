// creating a simple method

def ozMethod(){
    println "OZ..."
}

ozMethod() // you have to call the method to print it

def sum(int a, int b=2){ // method expects 2 parameters; b=2 is default in case no param will be passed when called
    println "Sum is "+(a+b)
}
sum(5,3)
sum(5)

def sub(int a, int b){
    def c = a-b
    return c
}
def result = sub(12,4)
println "here is the $result "

class methodInClass {
    static void main(args){
        methodInClass myFunc = new methodInClass() // created new object myfunct (as instance of the class methodInClass
        // and initiated it
        myFunc.OzMethod2() // using myfunc object can call method and properties of this class

    }
    def OzMethod2(){
        println ("abracadabra inside OZMethod")
    }
}
