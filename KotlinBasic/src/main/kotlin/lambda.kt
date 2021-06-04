val sum1: (Int, Int) -> Int = {x: Int, y: Int -> x+y }

var sub = {x: Int, y: Int -> x-y}

fun main() {
    println("1 + 1 = ${sum1(1,1)}")
    println("1 - 1 = ${sub(1,1)}")

}