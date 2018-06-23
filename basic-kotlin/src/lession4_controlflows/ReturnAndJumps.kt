fun main(args: Array<String>) {

    // continue
    for (count in 1..10) {
        if (count == 4) {
            continue
        }
        println(count)
    }

    // break
    for (count in 1..10) {
        if (count == 7) {
            break
        }
        println(count)
    }

    // jump loop
    firstLoop@ for (count in 1..5) {

        secondLoop@ for (count2 in 1..5) {

            if (count == 3) {
                break@firstLoop
            }

            if (count2 == 2) {
                break@secondLoop
            }

            println("count: $count | count2: $count2")
        }
    }
}