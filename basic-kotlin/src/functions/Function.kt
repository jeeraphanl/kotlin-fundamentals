fun main(args: Array<String>) {

    val original = "kotlin"
    val addPlus = addPlus(original)
    val addPlus2 = addPlus(str1 = original, str2 = original)
    val addDefault = addDefault()

    println(addPlus)
    println(addPlus2)
    println(addDefault)
    println(returnUnti())
}

fun addPlus(str: String): String {
    return "$str+"
}

fun addPlus(str1: String, str2: String): String {
    return "$str1+ $str2+"
}

fun addDefault(str: String = "default string"): String {
    return "$str"
}

fun returnUnti(): Unit { // Unit is optional
    println("return Unit")
}