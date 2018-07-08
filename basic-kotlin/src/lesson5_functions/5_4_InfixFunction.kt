/**
 * Infix function can be a member function or extension function
 * They have single parameter
 * Thy have prefix of "infix"
 */

fun main(args: Array<String>) {
    println("kotlin".addPlusValue("++"))

    println("kotlin" addPlusValue("--"))
}

infix fun String.addPlusValue(value: String): String {
    return this + value
}