import kotlin.lazy

fun main() {
    val meow = Cat()
    meow.name = "kitty"

    // val browny by lazy { Cat().name = "browny" }
    /* You’re assigning the result of the expression Cat().name = "browny" to the browny variable.
    But that expression doesn't return the Cat object — it returns the result of the assignment: a String.
    ❗ So browny is now of type String, not Cat */

    /*  val browny by lazy {
    Cat().apply { name = "browny" }
    }  */

    /*  ✅ 'apply' returns the original object (Cat)

    ✅ You can safely access browny.name later */

    val browny by lazy { Cat().apply { name = "Browny" } }

    // only one time line : 18 will run
    // when the object browny will be used only that time the object will be created otherwise not
    // here we are accessing not using so that's why we are not lazy did not initialized it

    // println("${browny.name}")

    // browny.name = "brown"
    // println("${browny.name}")

    // browny.name = "ani"
    // println("${browny.name}")
}

class Cat {
    lateinit var name: String
    init {
        println("object is created")
    }
}
