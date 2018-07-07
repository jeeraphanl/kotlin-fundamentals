
fun main(args: Array<String>) {

    CommonUtils.URL
    CommonUtils.callApi()
}


/**
 * Object declarations
 * Cannot Inheritance object class
 */

object CommonUtils {

    const val URL = "http://www.google.com"

    fun callApi() {
        println("Call API")
    }
}


/**
 * - object expressions are executed (and initialized) immediately, where they are used;
 * - object declarations are initialized lazily, when accessed for the first time;
 * - a companion object is initialized when the corresponding class is loaded (resolved), matching the semantics of a Java static initializer.
 */
