fun main() {
    // I am using it for git conflict checking, so donot mind anything
    // val = reference is immutable, but the object it points to can be mutable
    // var = reference is mutable (you can reassign it)

    var intMaxValue = Int.MAX_VALUE
    var intMinValue = Int.MIN_VALUE

    println("Max value of the Int is: $intMaxValue")
    println("Min Value of the Int is : $intMinValue")

    // val value: Int = 2147483648
    // This will not work like in c Language, the roundoff value will not be returned.
    //  Error will be shown at the compile time as it
    // expected long value but getting a long value
    // println("The value of the value is: $value")
    println(reverseString("abcd"))

    val language = "Kotlin"
    val version = 1.9
    val info =
            """
            Language: $language
            Version: $version
        """.trimIndent()

    println(info)
}

fun reverseString(s: String): String {
    val len: Int = s.length
    var revString = ""
    for (i in 0 until len) {
        var p = s[len - 1 - i]
        revString += p
    }
    return revString
}
