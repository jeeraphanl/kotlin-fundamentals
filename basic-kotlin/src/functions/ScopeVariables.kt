var language = "kotlin"

fun main(args: Array<String>) {

    language = "kotlin main"

    someFunction()
    //version not work
}

fun someFunction() {
    var version = "1.2" // local variable
    language = "kotlin some function $version"
}

// language scope