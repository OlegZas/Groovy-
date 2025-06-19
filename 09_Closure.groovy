// Closures in Groovy
/*
closures are blocks of code that can take parameters, refer variables, return values,
 can be passed as parameters in a fucniton or method
 */

def str = "la carta, el mapa, el planeta, el problema, el sistema, el dia, el programa, el poema, el idioma, la foto, la mano, la radio"
def myClosure1 = { name -> println "OZ esta aprendido /// $str //// $name"} //it's a block of code

myClosure1.call('muy rapido')

def myMethod(clos){
    clos.call("Groovy") // will call the method and give parameter
}
myMethod(myClosure1)

def Closure2 = {
    a,b,c ->
        return (a + b + c)
}
def res = Closure2(10,20,30)
println res
