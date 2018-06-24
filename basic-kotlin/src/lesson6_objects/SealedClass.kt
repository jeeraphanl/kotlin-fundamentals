
/**
 * It's class that can be subclassed, but only inside the file which it's declared.
 * If you try to subclass it in different file, you will get error.
 * Because the class and subclass are in the same file.
 * Kotlin will be able to know all subclass statically that is at compile time.
 * The compiler can see all of the classes and subclasses and it knows these are all of them.
 * So, the compiler can do extra checks for you.
 */

sealed class Seal

class Sealion : Seal()
class Walrus : Seal()

fun testFunction(seal: Seal): String {
    return when(seal) {
        is Sealion -> "Sealion"
        is Walrus -> "Walrus"
    }
}

fun main(args: Array<String>) {

    testFunction(Sealion())
}