fun main(args: Array<String>) {

    /**
     * List
     * 1. Immutable
     * 2. Fixed size
     * 3. Only Read
     */
    val list = listOf("kotlin", "java", 0, 0.1)
    val listWithType = listOf<String>("a", "b", "c")
    // cannot change value because only have setter
    //list[0] = "new kotlin"

    // List cannot add more value
    //list.add

    /**
     * MutableList
     * 1. Mutable
     * 2. Not Fixed size
     * 3. Read and Write
    */
    val mutableList = mutableListOf("kotlin", "java", 0, 0.1)
    val mutableListWithType = mutableListOf<String>("kotlin", "java")

    mutableList[0] = "new kotlin"
    mutableList.add("more value")

    mutableListWithType.add("only add string type")
    //mutableListWithType.add(0) error because support only string type
}