
class User {

    var firstName: String = "Jeeraphan"
    var lastName: String = "Lairat"

    fun getFullName() = "$firstName $lastName "
}

class User2 {
    var firstName: String? = null
        get() {
            println("Get firstName")
            return field
        }
        set(value) {
            println("Set firstName")
            field = value
        }

    val lastName: String? = null
        get() {
            println("Get lastName")
            return field
        }
}

fun main(args: Array<String>) {

    val user = User()

    println(user.firstName)
    println(user.lastName)
    println(user.getFullName())

    val user2 = User2()
    user2.firstName = "Jeeraphan"
    //user2.last = "Lairat" // cannot reassign becoause lastName is only getter (val)
}