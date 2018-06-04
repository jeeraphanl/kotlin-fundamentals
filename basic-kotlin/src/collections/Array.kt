

fun main(args: Array<String>) {

    // create an array using a closure
    val arrayWithClosure = Array<String>(size = 5, init = { index -> "Item #$index" })

    // create an uninitialized array [null, null, null]
    val arrayOfNulls = arrayOfNulls<Int>(3)

    // create an array
    val array = arrayOf("kotlin", 1)
    val arrayType = arrayOf<String>("kotlin", "java")

    array[0] = "new kotlin"
    arrayType[0] = "new java"

    // cannot add more value
    //array.add()
    //arrayType.add()
}