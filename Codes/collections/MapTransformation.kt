fun main()
{
  // Define a set
  val set1 = setOf(1,2,3,4,5)
  println(set1)

  // This map transformation is a function that is taking a lambda function as an argument 
  // And it is performing some actions based on the lambda function on each element of the set/map/list etc..
  println(set1.map{it * 2})
  println(set1)

  /*
    * Returns a list containing only the non-null results of applying the given [transform] function
    * to each element and its index in the original collection.
    * @param [transform] function that takes the index of an element and the element itself
    * and returns the result of the transform applied to the element.
    *
    public inline fun <T, R : Any> Iterable<T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): List<R> 
    {
    return mapIndexedNotNullTo(ArrayList<R>(), transform)
    }
  */
  println(set1.mapIndexedNotNull{index, value -> if(index == 0) null else 2 * 5})


  val map1 = mapOf("in" to "India", "us" to "USA", "jp" to "Japan")

  println(map1.mapKeys{it.key + 2})
  println(map1.mapValues{it.value + 2})
}


// mapIndexedNotNull -->
// complecated but may be required later from the -> documentation of kotiln github 
/*
 
  
 * Returns a list containing only the non-null results of applying the given [transform] function
 * to each element and its index in the original collection.
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 
public inline fun <T, R : Any> Iterable<T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): List<R> {
    return mapIndexedNotNullTo(ArrayList<R>(), transform)
}

/*
 * Applies the given [transform] function to each element and its index in the original collection
 * and appends only the non-null results to the given [destination].
 * @param [transform] function that takes the index of an element and the element itself
 * and returns the result of the transform applied to the element.
 */

public inline fun <T, R : Any, C : MutableCollection<in R>> Iterable<T>.mapIndexedNotNullTo(destination: C, transform: (index: Int, T) -> R?): C {
    forEachIndexed { index, element -> transform(index, element)?.let { destination.add(it) } }
    return destination
}
 
 * Performs the given [action] on each element, providing sequential index with the element.
 * @param [action] function that takes the index of an element and the element itself
 * and performs the action on the element.
 
public inline fun <T> Iterable<T>.forEachIndexed(action: (index: Int, T) -> Unit): Unit {
    var index = 0
    for (item in this) action(checkIndexOverflow(index++), item)
}
 

*/
