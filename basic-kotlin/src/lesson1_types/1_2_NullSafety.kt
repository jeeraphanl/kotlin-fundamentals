fun main(args: Array<String>) {

    /**
     * NonNull
     */
    var nameNotNull = "Jeeraphan Lairat"
    println("nameNotNull is $nameNotNull")


    /**
     * Nullable
     */
    var nameNullable: String? = null
    nameNullable?.toInt()

    nameNullable?.let {
        println("nameNullable value is $nameNullable")
    } ?: kotlin.run {
        println("nameNullable is null")
    }

    // !! is make sure value is not null
    // if value is null it will crash
    //println(nameNullable!!) // KotlinNullPointerException thrown


    // short code
    val value: String? = "Nullable String Value"
    val lengthValue = value?.length ?: -1
    println("lengthValue: $lengthValue")
}