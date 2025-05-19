fun main() {
    val willy = Dog()
    willy.breed = "labrador"
    // line: 7 will give the error because we did not initialized the name property now
    // Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property
    // name has not been initialized
    println("name of the dog is ${willy.name}")
    willy.name = "willy"
    println("name of the dog is ${willy.name}")
}

class Dog() {

    // we want that we will initialize the property later not now so we use lateinit(later
    // initialize) keyword,
    // otherwise we have to initialize the property immediately to avoid null pointer exception
    /* lateinit is a keyword used to declare a non-nullable variable that will be initialized later,
    rather than at the point of declaration */
    lateinit var breed: String
    lateinit var name: String
}
