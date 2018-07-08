
/**
 * Use an Interface if you have a lot of methods and one or two default implementations
 * Interfaces can’t keep state
 */

interface Action {

    fun eat()
    fun walk()
    fun run()
    fun jumb()

    fun sleep() {
        println("sleep")
    }
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
 * Interface delegation
 */
interface A {
    fun funcA()
}

interface B {
    fun funcB()
}

class C(val a: A, val b: B) {
    fun funcC() {
        a.funcA()
        b.funcB()
    }
}

/**
 * ???????????????????????
 */
class D(a: A, b: B): A by a, B by b {
    fun funcD() {
        funcA()
        funcB()
    }
}