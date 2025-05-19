fun main() {
    // println(getMax(100, 22))
    // println(getMax(10, 20, 15))
    printDetails(
            age = 18,
            name = "deep"
    ) // this a named arguments or named parameters for the function

    println(sum('a', 'b', 'c', 'd'))
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) {
        a
    } else if (b > a && b > c) {
        b
    } else {
        c
    }
}

// Default parameters and named parameters

/* Here a default value is assigned to the parameters if no arguments is passed during the function
call, the function will be with  the default values
if arguments are passed the defalut values will be overridden by the arguments */
fun printDetails(name: String = "User", age: Int = 0) {
    if ((name == "" || name == "User")) {
        println("Enter valid name")
    } else if (age >= 18) {
        println("You are elible for vote")
    } else {
        println("You are not elible for vote")
    }
}

// vararg ---> variable arguments
/* if we don't know the numbers of variables that are passed but they are similar type then
we can use this vararge keyword to define the parameter as vararg type
we cannot add more than one vararg type parameter, if we try to do so it will give the error -->
kotlin: Multiple vararg-parameters are prohibited */

fun sum(vararg numbers: Char): String {
    var sum = ""
    for (num in numbers) {
        sum += num
    }
    return sum
}
