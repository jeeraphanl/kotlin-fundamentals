fun main(args: Array<String>) {

    // for loop
    for (index in 1..5) {
        println(index)
    }

    // for each
    val input = readLine()
    input?.toCharArray()?.forEach {
        println("forEach: $it")
    }

    input?.toCharArray()?.forEachIndexed { index, c ->
        println("forEach index: $index char: $c")
    }

    // while loops
    var count = 0
    while (count < 5) {
        println("while loop count: $count")
        count++
    }

    // do while loop
    var count2 = 0
    do {
        println("do while loop count: $count2")
        count2++
    } while (count2 < 5)

    repeat(10) { index ->
        println("repeat: $index")
    }
}