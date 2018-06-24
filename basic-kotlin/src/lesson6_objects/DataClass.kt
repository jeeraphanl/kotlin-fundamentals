/**
 * eques, copy, toString
 */
data class Phone(val name: String) {}

fun main(args: Array<String>) {

    val phone1 = Phone("iPhone")
    val phone2 = Phone("Sumsung")
    val phone3 = Phone("Sumsung")

    println(phone1 == phone2)
    println(phone2 == phone3)
}