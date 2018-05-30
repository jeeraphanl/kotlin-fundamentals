

fun main(args: Array<String>) {

    try {
        val number = "xyz".toInt()
        println("number: $number")
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    } finally {
        println("finally")
    }
}