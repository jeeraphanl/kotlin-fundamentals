
class Computer {

    private val name = "Notebook"

    class PC {

        fun show() {
            println("PC")
        }
    }

    inner class Type {

        fun show() {
            println(name)
        }
    }
}

fun main(args: Array<String>) {

    var computer = Computer()
    var type = Computer.PC()
    type.show()
    computer.Type().show()
}