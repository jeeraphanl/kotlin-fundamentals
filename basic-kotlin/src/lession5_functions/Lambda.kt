fun main(args: Array<String>) {

    tryToPrint()
    println(waterFilter(20))
    println(waterFilter2(40))
    dirtyProcessor()
}

val tryToPrint = { println("Hello lambda function") }
var dirty = 20
val waterFilter: (Int) -> Int = { number: Int ->  number / 2 }
val waterFilter2 = { number: Int ->  number / 2 }

fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty ->
        dirty + 50
    })
}