fun main(args: Array<String>) {

    readLine()?.let {

        val age = when(it.toInt()) {
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

        println(age)
    }
}