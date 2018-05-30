fun main(args: Array<String>) {

    var nameNullable: String? = null
    var nameNotNull = "Jeeraphan Lairat"
    var sampleNameNullable: String? = null

    sampleNameNullable?.toInt()

    nameNullable?.let {
        println("$nameNullable")
    }

    println("$nameNotNull")

    val message: String? = null
    println(message!!) // KotlinNullPointerException thrown, app crashes

    val a: String? = "Nullable String Value"
    val b = a?.length ?: -1

    println("b: $b")
}