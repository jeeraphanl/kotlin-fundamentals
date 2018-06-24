
fun main(args: Array<String>) {

    /**
     * HashMap and MutableMap
     * 1. Mutable
     * 2. Not Fixed size
     * 3. Read and Write
     */

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


    val mutableMapOf = mutableMapOf(1 to "kotlin")
    hasMapOf[1] = "kotlin2"
    mutableMapOf[2] = "kotlin2"

    hasMapOf.forEach {
        println("hasMapOf: $it")
    }

    mutableMapOf.forEach {
        println("mutableMapOf: $it")
    }


    /**
     * Map
     * 1. Immutable
     * 2. Fixed size
     * 3. Read and Write
     */

    val mapOf = mapOf(1 to "kotlin") // cannot add and change
    mapOf.forEach {
        println("mapOf: $it")
    }
}