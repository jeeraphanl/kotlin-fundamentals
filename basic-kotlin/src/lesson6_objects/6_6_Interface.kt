
interface Action {

    fun eat()
    fun walk()
    fun run()
    fun jumb()
}

class Animal : Action {

    override fun eat() = println("eat")

    override fun walk() = println("walk")

    override fun run() = println("run")

    override fun jumb() = println("jumb")
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.eat()
    animal.walk()
    animal.run()
    animal.jumb()
}

/**
 * Use an Interface if you have a lot of methods and one or two default implementations
 */