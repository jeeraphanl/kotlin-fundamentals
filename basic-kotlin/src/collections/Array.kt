

fun main(args: Array<String>) {

    // create an array using a closure
    val arrayWithClosure = Array<String>(size = 5, init = { index -> "Item #$index" })

    // create an uninitialized array [null, null, null]
    val arrayOfNulls = arrayOfNulls<Int>(3)

    // create an array
    val arrayOf = arrayOf("kotlin", 1)
    val arrayOfType = arrayOf<String>("kotlin", "java")

    arrayOf[0] = "new kotlin"
    arrayOfType[0] = "new java"
}