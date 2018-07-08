

fun main(args: Array<String>) {

    /**
     * Array
     * 1. Mutable
     * 2. Fixed size
     * 3. Read and Write
     *
     * Have to know size and default value
     */
    val arrayInt = Array<Int>(7){0}

    // create an array using a closure
    val arrayWithClosure = Array<String>(size = 5, init = { index -> "Item #$index" })

    // create an uninitialized array [null, null, null]
    val arrayOfNulls = arrayOfNulls<Int>(3)

    // create an array
    val arrayMultipleType = arrayOf("kotlin", 1)
    val arrayStringType = arrayOf<String>("kotlin", "java")

    arrayMultipleType[0] = "new kotlin"
    arrayStringType[0] = "new java"

    // cannot add more value because it' have fix size
    //array.add()
    //arrayType.add()

    println(arrayInt)
    println(arrayWithClosure)
    println(arrayOfNulls)
}