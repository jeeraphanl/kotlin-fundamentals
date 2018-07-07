/**
 * It's class that can be subclassed, but only inside the file which it's declared.
 * If you try to subclass it in different file, you will get error.
 * Because the class and subclass are in the same file.
 * Kotlin will be able to know all subclass statically that is at compile time.
 * The compiler can see all of the classes and subclasses and it knows these are all of them.
 * So, the compiler can do extra checks for you.
 */

sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
}