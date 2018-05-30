
class People {

    // encapsulation
    private var age: Int? = null

    fun setAge(age: Int) {
        if (age < 0) {
            this.age = 0
        } else {
            this.age = age
        }
    }

    fun getAge(): Int? {
        return this.age
    }
}

fun main(args: Array<String>) {

    val people = People()
    people.setAge(7)
    println(people.getAge())
}