
fun main(args: Array<String>) {
    println(getMyName("emji"))
}

inline fun getMyName(name: String) = "Your name is $name"