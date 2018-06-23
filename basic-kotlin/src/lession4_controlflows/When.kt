fun main(args: Array<String>) {

    readLine()?.let {

        when(it.toInt()) {
            1 -> println("value is 1")
            2 -> println("value is 2")
            3 -> println("value is 3")
        }

        when(it.toInt()) {
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

        when {
            it.toInt() == 0 -> {
                println("value is zero")
            }
            it.toInt() - 2 in 4..10 -> {
                println("value decrease 2 in range 4..10")
            }
        }
    }
}