fun main(args: Array<String>) {

    //constants
    val numberVal: Int = 1
    val pi: Double = 3.14159
    val tenThousand: Int = 10_000
    val typeInferredInt = 27 // type inference, check type with (control + shift + P)

    println("numberVal: $numberVal")
    println("pi: $pi")
    println("tenThousand: $tenThousand")
    println("typeInferredInt: $typeInferredInt")
    //numberVal = 6 compilation error

    //types
    var numberVar = 0
    println("numberVar: $numberVar")
    numberVar = 5
    println("numberVar: $numberVar")
}

// forgot lateinit var