// defining class in java style
class Demo {
    static void main(String[] args) {
        println('Oleg is in Groovy now!')

        // Closures: Closures in Groovy can be used as a
        // lightweight alternative to methods or functions. A closure is 
        // an anonymous block of code that can be passed around and executed. For example:
        def greet = { name -> println "Hello, $name!" }
        greet("Oleg")
    }

}
// in groovy class is not necessary

println 'Oleg is in Groovy now!'
