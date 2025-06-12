// Script-style code: Groovy allows writing code
// in a script-style without wrapping it in a class, which is common for simple tasks. You can run code directly in a Groovy script.
def x = 5
def X = 6
// dynamic typing - not defining a variable data type and it can change :
x = "Oleg" // from int to a string
println("The value of x is ${x} and X is ${X}")
// Datatypes
byte b = 10
println b
println Byte.MAX_VALUE
println Byte.MIN_VALUE
//Operators
assert 1+32 == 33 // assert checks if the expression is true
assert 2 ** 2 == 4

c = 6
c *= 3
assert c ==18
println "c = ${c}"

// Trenary operator -- instead of if can use ?

def output = (55<3) ? "55 is greater" : '55 is not greater!'
println output
