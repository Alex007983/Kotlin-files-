fun main() {
    val disel = DiselEngine(2.8f, 1000)
    val petrol = PetrolEngine(1.2f, 1122)
    val electric = ElectricEngine(20f, 800)

    disel.startEngine()
    petrol.startEngine()
    electric.startEngine()
}

interface Engine {
    /* Different Engine may start differently.
     every class that will inherite this interface the function will be different for that class
    we are sure
    That's why we don't implement the function and we are sure this function is necessary if this
    interface is inherited
    So we just declare the function.
    we cannot create any object from the interface, Because It has no constructor to initialize
    and no methods to run.
    It is like a theory, using the knowledge of this theory we can create something practical. */

    /* An interface is like an abstract idea of a "remote control".
    You can’t use just the idea — you need an actual, physical remote.
    That physical remote is the class that implements the interface.*/

    fun startEngine()
}

class DiselEngine(val capacity: Float, val power: Int) : Engine {
    override fun startEngine() {
        println("Disel Engine is starting")
    }
}

class ElectricEngine(val capacity: Float, val power: Int) : Engine {
    override fun startEngine() {
        println("Electric Engine has been started")
    }
}

class PetrolEngine(val capacity: Float, val power: Int) : Engine {
    override fun startEngine() {
        println("Petrol Engine has been started")
    }
}
