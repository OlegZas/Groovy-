
// Input and Output in groovy
// ********************* to get input when running in the console *************************
print "Here is Oleg again: "
def name = System.console().readLine()  //function that takes the input from the console stored into variable
// System.console() only works when the script is run from a real terminal (like PowerShell, CMD, or Terminal).
println "Hello $name"

print "Enter a number : "
def num1 = System.console().readLine().toInteger() // to interger converts entered number into an integer

print "Enter numero dos : "
def num2 = System.console().readLine().toInteger() // to interger converts entered number into an integer

println "$num1 + $num2 = "+(num1 +num2)

// **************** to get input in the IDE ***************************************
def scanner = new Scanner(System.in) // create a new Scanner object and use System.in to get input

print "Here is Oleg again: "
def oz = scanner.nextLine() // this method  gets user input
println "Hello $oz"

print "Enter a number: "
def zas = scanner.nextLine().toInteger() //Converts the string to an Integer using .toInteger()

print "Enter numero dos: "
def zas1 = scanner.nextLine().toInteger()

println "$zas + $zas1 = ${zas + zas1}"

// ************* user Output *******************
def nombre = "Olego"
println("mi nobre es $nombre")
// printf is used for formatted output; can use % with printf ; you can also add padding
printf "el nombre es %s \n", nombre // \new line... %s is to input a string

printf "%s | %d |%.2f \n", ["oz", 34,23.938498348] // padding
// adding padding to variable outut:
printf "%10s | %-10d |%.2f \n", ["oz", 34,23.938498348] // -10 is negative padding
