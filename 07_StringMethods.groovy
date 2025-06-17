// Strings in Groovy '..'
// double quoted strings ".."
// triple quoted strings '''...'''
//slashy /.../
// dollar slashy string $/.../$

def name = "OZioa"
println name
println "My name is " + name
println "My name is".concat(name) // different way to concatenate
println "My name is ${name} or $name "
def s1 = """This is Oleg's class // using a multiline 
and he is learning"""
println s1
println name.length()
println name[2] // get character at index position
println name[-2]
println name.indexOf('O') // get index position of character
println name[0..2] // get all character for index from 0 to 2
println name[4..2] // print in reverse
println name[0,2,4] // index of characters to print
println name.substring(2) // string prints starting with 2 index
println name.subSequence(1,4) // start from 1 until 4
def str = "This is groovy class"
println str.split(" ") // when there is a space the string will be split into a list of elements
println str-("groovy") // removes word from the string
println str.replace("class", "sessionO")
println str.toLowerCase()
println str.toUpperCase()
println str.toList()// every character of the string is converted to a list
println "Groovy " * 3 // repeating a string
println "Abc".equals("abc") // checks if string is equal xx
println "Abc".equalsIgnoreCase("abc") // better, because it ignores case

def s3 = /working hard "forever" : 
    $name/ // with slash string or $/ it is possible to use "" and print them
def s4 = $/studying now $name/$
println s3
println s4
