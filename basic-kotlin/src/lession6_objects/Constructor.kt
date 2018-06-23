
class Dog {
    var name = ""

    constructor(name: String) {
        this.name = name
    }

    fun printName() {
        println(name)
    }
}

class Cat(val name: String) {

    fun printName() {
        println(name)
    }
}

fun main(args: Array<String>) {

    val dog = Dog("Dang")
    val cat = Cat("Dum")

    dog.printName()
    cat.printName()
}