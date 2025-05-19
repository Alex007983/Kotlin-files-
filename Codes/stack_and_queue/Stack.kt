class Stack {
    private var DEFAULT_SIZE = 1
    var stackArr = Array(DEFAULT_SIZE){0}
    var stackSize = 0
    fun push(num: Int) {
        if ((DEFAULT_SIZE - 1) < stackSize) increaseStackSize()
        this.stackArr[stackSize] = num
        this.stackSize++
    }

    fun increaseStackSize() {
        this.DEFAULT_SIZE = DEFAULT_SIZE * 2
        var newArr = Array(DEFAULT_SIZE){0}
        for (i in 0 until stackSize) {
            newArr[i] = stackArr[i]
        }
        this.stackArr = newArr
    }

    fun print() {
        for (i in 0 until stackSize) {
            println(stackArr[i])
        }
    }
}

fun main() {
    val stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(6)

    stack.print()
}
