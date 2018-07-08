/**
 * Base class
 */
open class Shape {
    open fun getArea(): Int = 0
}

/**
 * Inheritance
 */
class Square(private val width: Int) : Shape() {

    // overriding
    override fun getArea(): Int {
        return width * width
    }
}

/**
 * Inheritance
 */
class Rectangle(private val width: Int, private val height: Int) : Shape() {

    // overriding
    override fun getArea(): Int {
        return width * height
    }
}

fun main(args: Array<String>) {

    val square = Square(4)
    val rectangle = Rectangle(3, 5)

    printArea(square)
    printArea(rectangle)
}

/**
 * Polymorphism
 */
fun printArea(shap: Shape) {

    println(shap.getArea())

    // casting
    val square = shap as Square
    val rectangle = shap as Rectangle

    println(square.getArea())
    println(rectangle.getArea())
}