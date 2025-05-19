class If_Else {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val n1 = 10
            val n2 = 5

            // we can assign a value returned from if else block
            /* the returned answer can be dynamic until we explicitely define the type of the returned variable,
            ex : if we write val res : String it will accept the String values only */
            val res =
                    if (n1 > 5 && n2 < 10) {
                        ("The range of the n1 and n2 is between 5 to 10")
                    } else if (n1 == n2) {
                        n2
                    } else {
                        "The range of the n1 and n2 is not between 5 to 10 and also not equal"
                    }
            println(res)
        }
    }
}
