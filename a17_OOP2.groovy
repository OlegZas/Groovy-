
// note: in this exercises i am often combining my daily practice with spanish or english vocab that i am lerarning.
// I do understnad the concept and importance of the NAMING CONVENTIONS, but here i am pairing multiple daily habits that i am working on.
class a17_OOP2 {

    String obfuscate;
    String amicable;

    int esoteric;

    // defining a function
    def getTheVocab () {
        println "The word is $obfuscate and  $amicable and $esoteric"
    }
    def startVocab() {
        println "definitions are here"
    }

    static void main(args){
        a17_OOP2 misanthrope = new a17_OOP2 ()
        a17_OOP2 enigmatic = new a17_OOP2()
        a17_OOP2 ruminate = new a17_OOP2()

        misanthrope.obfuscate = "to deliberately confuse or make hard to understand"
        enigmatic.amicable = "friendly, peaceful"
        ruminate.obfuscate = "esoteric - only known be select few with specialized interest"
        misanthrope.amicable = "misanthrope - someone who dislikes people"
        enigmatic.obfuscate = "enigmatic - secretive, mysterious, difficult to interpret"
        ruminate.amicable = 'reconcile - to correct the differences, to make peace'
        ruminate.esoteric = 323
        misanthrope.esoteric = 23
        enigmatic.esoteric = 1

        misanthrope.getTheVocab()
        enigmatic.getTheVocab()
        ruminate.startVocab()
    }
}
