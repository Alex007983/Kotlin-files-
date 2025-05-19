fun main() {
    val dog = Animal("willy", "bark", "black")
    dog.size = 20.5f
    dog.weigth = 30.6f
}

class Animal(var name: String, var sound: String, var color: String) {
    var size: Float = 0.0f

        // a little bit different than java 😭, In JAVA getter and setter are just methods like
        // other normal methods
        get() {
            // this.size again calling this get function, and the due to infinite recursion the
            // stack is overflowing and getting an error
            // return this.size
            return field
        }
        set(size) {
            // if I set this weight through primary constructor this message will not appear
            println("the size id set to ${size}")
            // this.size is again calling set method and again recursion 😭, this is not the JAVA
            // this.size = size
            field = size
        }

    var weigth: Float = 0.0f
        get() {
            return field
        }
        set(weight: Float) {
            // if I set this weight through primary constructor this message will not appear
            println("the size id set to ${weight}")
            field = weight
        }

    // my argument is why do I need to set the getter and setter only after the properties of the
    // object, why KOTLIN why ???
}

// we can override our own getter and setter by doiong this, there are many approaches one of them
// is

/*
class Animal(var name: String, var sound: String, var color: String) {
    // literally _size is the backing field of size 😒
    // WTF
    private var _size: Float = 0.0f
    var size: Float
        get() = _size
        set(size) {
            println("this is the alternative method of using field keyword 🫩")
            println("the size id set to ${size}")
            _size = size
        }

    // literally _weight is the backing field of weight 😒
    private var _weight: Float = 0.0f
    var weigth: Float
        get() = _weight
        set(weight: Float) {
            println("this is the alternative method of using field keyword 🫩")
            println("the size id set to ${weight}")
            _weight = weight
        }
}

*/
