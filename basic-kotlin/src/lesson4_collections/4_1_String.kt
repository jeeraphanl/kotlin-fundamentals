fun main(args: Array<String>) {

    /**
     * Charactor
     */
    val char: Char = 'a'
    println(char)

    /**
     * String
     */
    val dog: String = "Dog"

    println(dog[1]) // print o

    for (c in dog) {
        println(c)
    }

    /**
     * Concatenation
     */
    val str1 = "Hello, World!"
    val str2 = "Hello, " + "World!"


    /**
     * symbol == like a equals command
     */
    println(str1 == str2)


    /**
     * String templates
     */
    println("length of acb is ${"acb".length}")
    println("${"\$fool"}")
}