
fun main(args: Array<String>) {

    for (i in 1 until 10) {
        someFunction { println("Hello someFunction") }
    }

    for (i in 1 until 10) {
        someInlineFunction { println("Hello someFunction") }
    }
}

fun someFunction(func: () -> Unit) {
    func()
}

inline fun someInlineFunction(func: () -> Unit) {
    func()
}

/**
 * Useful to high order functions
 */