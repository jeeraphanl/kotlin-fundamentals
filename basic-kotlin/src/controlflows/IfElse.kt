fun main(args: Array<String>) {

    readLine()?.let {

        val grade = it.toInt()

        if (grade > 80) {
            println("A")
        } else if (grade > 70) {
            println("B")
        } else if (grade > 60) {
            println("C")
        } else if (grade > 50) {
            println("D")
        } else {
            println("F")
        }
    }
}