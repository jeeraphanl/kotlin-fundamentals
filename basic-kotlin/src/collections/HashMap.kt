
fun main(args: Array<String>) {

    val map = HashMap<Int, String>()
    map[0] = "Java"
    map[2] = "Kotlin"
    map[3] = "Swift"

    val mapKeyString = HashMap<String, String>()
    mapKeyString["Java"] = "Java"
    mapKeyString["Kotlin"] = "Kotlin"
    mapKeyString["Swift"] = "Swift"

    for (key in map.keys) {
        println("key: $key value: ${map[key]}")
    }

    for (key in mapKeyString.keys) {
        println("key: $key value: ${mapKeyString[key]}")
    }

    val hasMapOf = hashMapOf(1 to "Kotlin")
    val mapOf = mapOf(1 to "kotlin") // cannot add and change
    val mutableMapOf = mutableMapOf(1 to "kotlin")

    hasMapOf[1] = "kotlin2"
    mutableMapOf[2] = "kotlin2"

    hasMapOf.forEach {
        println("hasMapOf: $it")
    }

    mapOf.forEach {
        println("mapOf: $it")
    }

    mutableMapOf.forEach {
        println("mutableMapOf: $it")
    }
}