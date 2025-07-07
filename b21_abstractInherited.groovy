// cannot have an absract method in an abstract class - the method must be overwridden

class b21_abstractInherited extends a21_abstract{
    int atthebeginning;
    @Override // this is annotation for the complier. “This method is overriding a method defined in a superclass or abstract class.”
    public Object alprincipio(){ // Object is the top-level base class. same in python 
        // In Groovy (and Java), Object is the root class of all classes. Every class implicitly extends it unless stated otherwise.
       // This declares that the method alprincipio() returns an Object (the most generic return type).
// You can omit public Object in Groovy unless you need Java-style signatures
        println "$tapa_smalldish elprincipio is $atthebeginning "
    }
    static void main(args){
        b21_abstractInherited agradable = new b21_abstractInherited();
        agradable.el_impuesto_tax = 'tax';
        agradable.tapa_smalldish = 'small dish, tapas'
        agradable.un_diaDefiesta_holiday = 'holiday'
        agradable.ambiente = 34343535;
        agradable.alprincipio();
        agradable.esOtroCuento();
    }
}
