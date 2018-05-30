fun main(args: Array<String>) {

    val stringArrayList = ArrayList<String>()
    val intArrayList = ArrayList<Int>()

    stringArrayList.add("java")
    stringArrayList.add("kotlin")
    stringArrayList.add("swift")

    intArrayList.add(0)
    intArrayList.add(1)
    intArrayList.add(2)

    println("[]: ${stringArrayList[0]}")
    println("[]: ${intArrayList[0]}")

    stringArrayList.forEach {
        println("$it")
    }

    intArrayList.forEach {
        println("$it")
    }
}