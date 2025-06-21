/*
RANGES
 used to create a list of sequential values
 denoted by first and last value of the sequence
 1..10
a..z
 3434..232
 TWO TYPES:
 1. Inclusive range : 1..10 (inlcudes 10)
2. Exclusive 1..<10 (will not include 10, will include 9 int)
*/

def ramification = 1..10
println ramification
println ramification.size()
println ramification.getFrom() // where range starts
println ramification.getTo() // last digits of the range

assert ramification.from == 1
assert ramification.to == 10

println ramification.get(3) // getting indexed element
println ramification[3] // getting indexed element

println ramification.contains(6) // check if contians a value then print true or false
println ramification.isReverse() // check if it's reversed or not (true/false)

def precarious = ramification.subList(3,7) // getting a sublist of elements from the range
println precarious
println precarious.getFrom() // printing smallest vlaue from the list derived from the range
println precarious.getTo() // biggest value from the list from the range

for(i in ramification){
    println i
}

// using a closure
ramification.each {i ->
    println "vlaue = $i"
}

//
println ramification instanceof java.util.List // ranges are instances of Java.util.List class 
