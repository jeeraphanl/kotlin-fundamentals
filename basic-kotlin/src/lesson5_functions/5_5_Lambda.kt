fun main(args: Array<String>) {

    /*
    tryToPrint()
    println(waterFilter(20))
    println(waterFilter2(40))
    dirtyProcessor()
    */

    println(name)
    println(nameShortSyntax)
    println(firstName)
    println(firstName("Jeeraphan"))
    println(firstNameShortSyntax("Jeeraphan"))
    println(firstNameVeryShortSyntax("Jeeraphan"))
    println(fullName)
    println(fullName("Jeeraphan", "Lairat"))
    println(fullNameShortSyntax("Jeeraphan", "Lairat"))
    println(fullNameVeryShortSyntax("Jeeraphan", "Lairat"))
    println(multiplyLambda)
    println(multiplyLambda(7, 7))
}

/**
 * First class function
 */
val name: () -> String = { "emji" }

val nameShortSyntax = { "emji" }


/**
 * Function with 1 parameter and return string
 */
val firstName: (String) -> String = { firstName: String -> String
    firstName
}

val firstNameShortSyntax = { firstName: String -> String
    firstName
}

val firstNameVeryShortSyntax = { firstName: String -> firstName }

/**
 * Function with 2 parameters and return string
 */
val fullName: (String, String) -> String = { firstName: String, lastName: String -> String
    "$firstName and $lastName"
}

val fullNameShortSyntax = { firstName: String, lastName: String -> String
    "$firstName and $lastName"
}

val fullNameVeryShortSyntax = { firstName: String, lastName: String -> "$firstName and $lastName" }

var multiplyLambda = { a: Int, b: Int -> Int
    a * b
}




val tryToPrint = { println("Hello lambda function") }

var dirty = 20
val waterFilter: (Int) -> Int = { number: Int -> number / 2 }
val waterFilter2 = { number: Int -> number / 2 }

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty ->
        dirty + 50
    })
}