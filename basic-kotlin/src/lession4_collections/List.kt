fun main(args: Array<String>) {

    // list
    val list = listOf("kotlin", "java", 0, 0.1)
    val listWithType = listOf<String>("a", "b", "c")
    val mutableList = mutableListOf("kotlin", "java", 0, 0.1)
    val mutableListWithType = mutableListOf<String>("kotlin", "java")

    // cannot change value because only have setter
    //list[0] = "new kotlin"

    // List cannot add more value
    //list.add

    mutableList[0] = "new kotlin"
    mutableList.add("more value")

    mutableListWithType.add("only add string type")
}