import java.util.*

fun main(args: Array<String>) {
    println("kotlin".toPlus())

    val today = Date()
    println("Today is Friday: ${today.isFriday()}")
}

fun String.toPlus(): String {
    return this + "+"
}

fun Date.isFriday(): Boolean {
    return Calendar.DAY_OF_WEEK == 5
}