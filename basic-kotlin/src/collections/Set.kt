fun main(args: Array<String>) {

    // set
    val setOf = setOf(1, 2, 3, 4, 5, 5)
    val mutableSetOf = mutableSetOf(1, 2, 3, 4, 5, 5)
    mutableSetOf.add(77)
    setOf.forEach {
        println(it)
    }
}