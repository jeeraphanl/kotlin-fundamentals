
class User {

    var firstName: String = "Jeeraphan"
        get() {
            println("Get firstName")
            return field
        }
        set(value) {
            println("Set firstName")
            field = value
        }

    var lastName: String = "Lairat"
        get() {
            println("Get lastName")
            return field
        }
        set(value) {
            println("Set lastName")
            field = value
        }

    fun getFullName(): String {
        return "$firstName $lastName "
    }
}

fun main(args: Array<String>) {

    val user = User()

    println(user.firstName)
    println(user.lastName)
    println(user.getFullName())
}