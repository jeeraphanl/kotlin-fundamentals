fun main(args: Array<String>) {

    /**
     * MutableSet
     * 1. Mutable
     * 2. Not Fixed size
     * 3. Only Read
     */
    val mutableSetOf = mutableSetOf(1, 2, 3, 4, 5, 5)
    mutableSetOf.add(77)

    /**
     * Set
     * 1. Immutable
     * 2. Fixed size
     * 3. Only Read
     */
    val setOf = setOf(1, 2, 3, 4, 5, 5)

    setOf.forEach {
        println(it)
    }
}



/**
 * Array: Mutable but has Fixed Size
 * Collections
 *  Immutable Collections : Read Only Operations
 *      Immutable List: listOf
 *      Immutable Map : mapOf
 *      Immutable Set : setOf
 *
 *  Mutable Collections Read and Write Both
 *      Mutable List : ArrayList, arrayListOf, mutableListOf
 *      Mutable Map  : HashMap, hasMapOf, mutableMapOf
 *      Mutable Set  : mutableSetOf, hashSetOf
 */
