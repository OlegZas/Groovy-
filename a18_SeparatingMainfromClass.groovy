// classes with functions and methods are created separately from the objects
class a18_ClassCallOutsideMain {
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

