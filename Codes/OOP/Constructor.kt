fun main() {
    val k10 = Car1("", "white", 5)

    println("car brand is : ${k10.brand}")
    println("car color is: ${k10.color}")
}

// here we use var/val keyword with parameters to make it primary Constructor

// Every Time we call a Secondary constructor we have to call primary constructor

// we can initialize the properties in the primary constructor instead of passing the values with
// the secondary constructor

class Car1(var brand: String, var color: String, var seats: Int) {

    /* If you want to run some code during object creation, use initializer blocks inside the class body.
    Initializer blocks are declared with the init keyword followed by curly braces.
    Write any code that you want to run within the curly braces */

    init {
        if (brand == "") {
            println("Please enter Your Car Brand Name")
        }
    }
    // we need to use keyword constructor to declare a secondary constructor

    /* Code in initializer blocks effectively becomes part of the primary constructor.
    Delegation to the primary constructor happens at the moment of access to the first statement of a secondary constructor,
    so the code in all initializer blocks and property initializers is executed before the body of the secondary constructor */

    constructor(brand: String) : this(brand, "white", 4) {
        // if some code has to be run those codes will be written here
    }

    // below code is wrong and the only change is var brand : String, because secondary constructor
    // cannot declare properties
    /* constructor(var brand: String) : this(brand, "white", 4) {

    } */

}
