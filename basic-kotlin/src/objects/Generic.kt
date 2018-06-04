/**
 * Generic Class
 */
class TestClass<T, R>(type: T, type2: R) {

    init {
        println("type: $type type2: $type2" )
    }

    fun <T, R> display(type: T, type2: R) {
        println("type: $type type2: $type2" )
    }
}

// T can be nullable
class ClassNullable<T>(private val paramter: T)

class ClassNonNull<T: Any>(private val paramter: T)

fun main(args: Array<String>) {

    var test = TestClass(7, "Seven")
    test.display(10, "Ten")

    val classNullable = ClassNullable(null)
    val classNonNull = ClassNonNull("")
}

/**
* Generic In and Out
*/

open class BaseClass()
class SubClass : BaseClass()
class SubClass2 : BaseClass()

class Jeeraphan<T: BaseClass>(val gender: T)

fun addItem(item: Jeeraphan<BaseClass>) = println("Add Item")

fun genericSample() {
    val jeeraphan = Jeeraphan(BaseClass())
    addItem(jeeraphan)
}