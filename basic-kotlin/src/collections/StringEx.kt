fun main(args: Array<String>) {

    val characterA: Char = 'a'
    val stringDog: String = "Dog"

    println(stringDog[1]) // print o

    for (c in stringDog) {
        println(c)
    }

    //Concatenation
    val str1 = "Hello, World!"
    val str2 = "Hello, " + "World!"

    // symbol == like a equals command
    println(str1 == str2)

    //String templates
    println("length acb is ${"acb".length}")
    println("${"\$fool"}")
}