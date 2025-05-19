fun main(args : Array<String>) {
  // there are two types of collections mutable and immutable
  // Immutable

  val imList = listOf<Int>(1,2,3,4,5)
  
  // Set does not contain duplicate values 
  // so here last 2, 1 will be removed 
  val imSet = setOf<Int>(1,2,3,4,5,2,1)

  /* map is a data structure where key-value pair is used 
  A Map is a collection of key-value pairs.
  Think of it like a real-world dictionary:

    🔑 The word is the key
    📘 The definition is the value

So you “look up” a value using a key. */
  val imMap = mapOf<String, String>("in" to "India", "us" to "Usa", "ch" to "China")

  imList.forEach{
    print("${it} \t") 
  }
  
  println()

  imSet.forEach{
    print("${it} \t")
  }

  println()

  println(imSet.elementAt(4))

  imMap.forEach{
    print("${it} \t")
  }

  println()

  println(imMap["in"])
}
