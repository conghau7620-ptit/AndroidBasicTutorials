import java.lang.Integer.parseInt

fun main() {
    var x = 1
    when (x) {
        1 -> println("x=1")
        2 -> println("x=2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    //multiple conditions
    when (x) {
        1,2 -> println("x is either 1 or 2")
        else -> println("x is neither 1 nor 2")
    }

    //arbitrary expression
    var s="2"
    when (x) {
        parseInt(s) -> println("s = x")
        else -> println("s != x")
    }

    //check in range or collection
    val numbers = listOf(1,2,3,4)
    when (x) {
        in numbers -> println("x is in the range 1-4")
        in 5..10 -> println("x is in the range 5-10")
        else -> println("x isn't in 2 range above")
    }

    //check is String
    fun getLength(x: Any) = when(x) {
        is String -> s.length
        else -> 0
    }
    println(getLength(s))

    //replace if else statement
    when {
        x%2==1 -> println("x is odd number")
        x<5 -> println("x is lower than 5")
        else -> println("2 conditions is not satisfied")
    }
}