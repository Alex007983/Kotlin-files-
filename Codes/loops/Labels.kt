fun main() {
    example()
}

fun example() {
    // outerloop@ is a label for the outer loop
    outerloop@ for (i in 1..10) {
        for (j in 1..5) {
            // this time this break pointer will be out of the outer  loop also
            // because of the labels
            if (j == 3) break@outerloop
            // here we are saying that break out of the outer loop also
            println(j)
        }
    }
}
