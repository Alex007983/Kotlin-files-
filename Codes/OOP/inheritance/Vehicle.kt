fun main() {}

open class Vehicle(val model: String, val brand: String, val typeOfVehicle: String) {}

class Car2(
        val engine_capacity: Float,
        val price: Int,
        val typeOfCar: String,
        model: String,
        brand: String
) : Vehicle(model, brand, "car") {}

class Bike() {}
