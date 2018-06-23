
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
            if (value.isNotEmpty()) {
                field = value
            }
        }

    fun getFullName(): String {
        return "$firstName $lastName "
    }
}

class UserProperties {
    var firstName: String? = null
    val lastName: String? = null
}

fun main(args: Array<String>) {

    val user = User()

    println(user.firstName)
    println(user.lastName)
    println(user.getFullName())

    val userProperties = UserProperties()
    userProperties.firstName = "setter"
    //userProperties.last = "setter" // cannot reassign becoause lastName is only getter (val)
}