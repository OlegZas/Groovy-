class b20_Inheritence extends a20_Inheritence{
    // defining a function specific to this class
    int reconcile
    def obfuscate (){
        println("to deliberately make something unclear or hard to understand. \n" +
                "$reconcile - reconcile means to make peace or make consistent with one another")
    }


    // creating a main method within an object

    static void main(args){
        b20_Inheritence objOz = new b20_Inheritence();
        objOz.reconcile = 344444
        objOz.venture ='venture'
        objOz.wonky= 'wonky'
        objOz.precarious = 'precarious'
        objOz.obfuscate()
        objOz.brazen()
        objOz.facetious()
        objOz.compel()

    }
}
