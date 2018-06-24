
fun main(args: Array<String>) {
    println(getName1())
    println(getName2())
    println(getFullName("Lairat"))
}

fun getName1(): String = "Jeeraphan"

fun getName2() = "Jeeraphan"

fun getFullName(lastName: String) = "Jeeraphan $lastName"