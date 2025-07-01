
class Averiguar {
    // Declaring instance variables to store translations and integer values
    String findout;
    String uncover;
    int atreverse;
    int todare;

    def printTotal(){
        println "$findout find out or uncover is the translation of averiguar = " +(atreverse + todare)
    }
    static void main(args) {
        Averiguar elcomedor = new Averiguar()
        // Assigning values to the instance variables of elcomedor
        elcomedor.findout = "alcanzar - to reach"
        elcomedor.uncover = "el lavabo - sink"
        elcomedor.atreverse = 33
        elcomedor.todare = 20
        elcomedor.printTotal()


        // Creating another object of Averiguar class named aportar
        Averiguar aportar = new Averiguar()
        aportar.findout = "la comoda - chest of drawers"
        aportar.atreverse = 1
        aportar.todare = 34
        aportar.printTotal()
    }
}