
// Abstract class - decleared with an abstract keyword, can have abstract, and non-abstract, static methods, can't be instantiated,
// can have constructors, can be a subclassed

// Why use Abstract classes?
// ********** is a way to define blueprints for other classes.
// ********** They're especially useful in object-oriented design when you want to enforce a common interface or structure for a group of related subclasses.

// Abstract method - doesn't have a body - Subclasses must override/implement them.
abstract class a21_abstract {
    String el_impuesto_tax ;
    String tapa_smalldish;
    String un_diaDefiesta_holiday;
    int ambiente;

    def esOtroCuento() {
        print "$el_impuesto_tax, $tapa_smalldish,$un_diaDefiesta_holiday"
    }
    abstract def alprincipio(); // abstract methods don't have a body?
}
