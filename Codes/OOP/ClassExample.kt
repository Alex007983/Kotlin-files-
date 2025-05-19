fun main() {
    val k10 = Car()
    k10.color = "white"
    k10.seats = 5
    k10.brand = "maruti"

    println("car brand is : ${k10.brand}")
    println("car color is: ${k10.color}")
}

class Car() {

    // state or properties of the object cannot be null
    var color = ""
    var seats = 4
    var brand = ""

    fun acc() {
        println("Car is now accelerating")
    }

    fun brake() {
        println("Car is now stopped")
    }
}
