
fun main(args: Array<String>) {

    CommonUtils.url
    CommonUtils.callApi()
}

object CommonUtils {
    const val url: String = "http://www.google.com"
    fun callApi() {
        println("Call API")
    }
}