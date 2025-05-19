fun main() {
    Human.sayHello()
    Human.anyName.sayHello()
    // both will give the same output
}

class Human {

    // companion object is like static keyword in java
    // companion objects does not belong to any instance it belongs to the class itself
    companion object anyName {
        var age = 0
        fun sayHello() {
            println("Hello we are Human")
        }
    }
}
