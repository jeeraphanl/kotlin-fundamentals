fun main(args: Array<String>) {

    /**
     * ArrayList
     * 1. Mutable
     * 2. Not Fixed size
     * 3. Read and Write
     */

    val stringArrayList = ArrayList<Any>()
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
        println(it)
    }

    intArrayList.forEach {
        println(it)
    }

    val arrayList = arrayListOf("a", "b", "c")
    // arralyList cannot init with multiple type
    //val arrayList = arrayListOf("a", "b", "c" 1)

    arrayList.forEach {
        println(it)
    }
}