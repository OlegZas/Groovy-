
// Class - collection of data and methods that represents a real world object and is used as a template to create objects

class a15_ClassesObjects { // a class name and a file name must match exactly

    private String esoteric // private means that it can't be accessed directly and can only be accessed through an object
    private String amicable

    // creating a method :
    def setwordOfTheDay(String word) { // // parameter 'word' will be assigned to 'esoteric'
        esoteric = word
    }
    // method to set the value of 'amicable'
    def setsecondWord(String words){ // String must be capitalized to show class
        amicable = words
    }
    // method to print the values of 'enigmatic' and 'amicable'
    def getTheword(){
        println ("The word is: $esoteric \n antoehr word is $amicable")
    }

    // main method — entry point of a Groovy application when run as a script/class
    static void main(args){

        // creating an object(instance) of the class Misanthrope

        a15_ClassesObjects firstone = new a15_ClassesObjects()
        // set the esoteric word
        firstone.setwordOfTheDay('Understood by a small number of specific people/тайный/скрытный')
        firstone.setsecondWord("friendly, nice")
        firstone.getTheword()
    }
}
