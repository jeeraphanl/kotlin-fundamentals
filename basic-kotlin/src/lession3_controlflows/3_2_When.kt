fun main(args: Array<String>) {

    val value = 7

    when (value) {
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
    }

    /**
     * Many condition
     * In rang condition
     * Out rang condition
     */
    when (value) {
        1, 2, 3 -> {
            println("value is 1 or 2 or 3")
        }
        in 4..10 -> {
            println("value in range 4..10")
        }
        !in 0..100 -> {
            println("value is not in range 0.100")
        }
        else -> {
            println("value is not range")
        }
    }

    /**
     * Look similar if else
     */
    when {
        value == 0 -> {
            println("value is zero")
        }
        value - 2 in 4..10 -> {
            println("value decrease 2 in range 4..10")
        }
    }
}