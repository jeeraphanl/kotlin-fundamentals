fun main(args: Array<String>) {

    println(name)
    println(nameShortSyntax)

    println(firstName("Jeeraphan"))
    println(firstNameShortSyntax("Jeeraphan"))
    println(firstNameVeryShortSyntax("Jeeraphan"))

    println(fullName("Jeeraphan", "Lairat"))
    println(fullNameShortSyntax("Jeeraphan", "Lairat"))
    println(fullNameVeryShortSyntax("Jeeraphan", "Lairat"))

    println(addLambda(7, 7))
    println(operateOnNumber(5, 5, addLambda))

    println(operateOnNumber(4, 4, ::addFunction))
}

/**
 * First class function
 */
val name: () -> String = { "emji" }

val nameShortSyntax = { "emji" }


/**
 * Lambda with 1 parameter and return string
 */
val firstName: (String) -> String = { firstName: String -> String
    firstName
}

val firstNameShortSyntax = { firstName: String -> String
    firstName
}

val firstNameVeryShortSyntax = { firstName: String -> firstName }

/**
 * Lambda with 2 parameters and return string
 */
val fullName: (String, String) -> String = { firstName: String, lastName: String -> String
    "$firstName and $lastName"
}

val fullNameShortSyntax = { firstName: String, lastName: String -> String
    "$firstName and $lastName"
}

val fullNameVeryShortSyntax = { firstName: String, lastName: String -> "$firstName and $lastName" }

var addLambda = { a: Int, b: Int -> Int
    a + b
}

/**
 * Function with 2 parameters and lambda
 */
fun addFunction(a: Int, b: Int): Int {
    return a + b
}

fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

/**
 * Use it
 */
val square: (Int) -> Int = { it * it }