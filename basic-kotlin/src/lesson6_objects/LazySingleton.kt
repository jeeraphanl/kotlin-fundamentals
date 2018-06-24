
class Singleton {

    var name: String? = null

    private constructor() {
        println("create singleton")
    }

    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {

    val singleton1 = Singleton.instance
    println(singleton1.name)
    singleton1.name = "singleton"
    println(singleton1.name)

    val singleton2 = Singleton.instance
    println(singleton2.name)
}