
fun main(args: Array<String>) {

    for (i in 1..4) print(i) // print 1234

    for (i in 4 downTo 1) print(i) // print 4321

    for (i in 1..4 step 2) print(i) // print 13

    for (i in 4 downTo 1 step 2) print(i) // print 42

    for (i in 1 until 10) print(i) // print 123456789
}