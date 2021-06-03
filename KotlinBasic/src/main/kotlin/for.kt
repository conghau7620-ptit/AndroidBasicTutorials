fun main() {
    for (i in 1..5) {
        println(i)
    }
    for (i in 6 downTo 0 step 2){
        println(i)
    }

    val numbers = listOf(1,2,3,4)
    for (i in numbers) {
        println(i)
    }
}