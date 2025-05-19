fun main() {
    val aa = 8
    val bb = 5
    add(aa, bb)
    val addLambda = { a: Int, b: Int -> println("a + b = ${a + b}") }

    // same output as add function
    addLambda(aa, bb)

    val subLambda = { a: Int, b: Int -> println("a - b = ${a - b}") }
    sub(aa, bb, subLambda)
    // OR
    sub(aa, bb) { a: Int, b: Int -> println("a - b = ${a - b}") }
}

fun add(a: Int, b: Int) {
    println("a + b = ${a + b}")
}

fun sub(a: Int, b: Int, subLambda: (Int, Int) -> Unit) {
    subLambda(a, b)
}
