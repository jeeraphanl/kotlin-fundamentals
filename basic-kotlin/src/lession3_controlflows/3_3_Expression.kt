fun main(args: Array<String>) {

    val value = 2

    /**
     * If Expression
     */
    val result1 = if (value == 0) {
        "my age is 1"
    } else if (value == 1) {
        "my age is 2"
    } else {
        "my age is other"
    }

    println("resutl2: $result1")



    /**
     * When Expression
     */
    val result2 = when(value) {
        1, 2, 3 -> {
            "my age is 1 or 2"
        }
        in 4..10 -> {
            "my age in range 3..10"
        }
        !in 0..100 -> {
            "my age is not in range 0.100"
        }
        else -> {
            "my age is not range"
        }
    }

    println("result1: $result2")
}