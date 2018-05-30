
// interface
interface ShapeInterface {

    fun getArea(): Int

    fun getArea2() {
        println("why interface can have concrete method")
    }
}

open class Shape : ShapeInterface {

    override fun getArea(): Int = 0
    // open fun getArea(): Int = 0
    // override final fun getArea(): Int = 0
}

class Square(private val width: Int) : Shape() { // inheritance

    // overriding
    override fun getArea(): Int {
        return width * width
    }
}

class Rectangle(private val width: Int, private val height: Int) : Shape() { // inheritance

    // overriding
    override fun getArea(): Int {
        return width * height
    }
}

fun main(args: Array<String>) {

    val square = Square(4)
    val rectangle = Rectangle(3, 5)

    // polymorphism
    printArea(square)
    printArea(rectangle)
}

fun printArea(shap: Shape) {

    println(shap.getArea())

    // casting
    val square = shap as Square
    val rectangle = shap as Rectangle

    println(square.getArea())
    println(rectangle.getArea())
}