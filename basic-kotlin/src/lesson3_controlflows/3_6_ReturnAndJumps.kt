fun main(args: Array<String>) {

    /**
     * Continue
     */
    for (count in 1..5) {
        if (count == 4) {
            continue
        }
        println("count $count")
    }

    /**
     * Break
     */
    for (count in 1..5) {
        if (count == 3) {
            break
        }
        println("break $count")
    }

    /**
     * Jump loop
     */
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