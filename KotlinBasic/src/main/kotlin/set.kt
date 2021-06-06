fun main() {
    val numbers = setOf("one", "two", "three")

    println(numbers union setOf("one", "five"))
    println(setOf("four", "five") union numbers)
    println(numbers intersect setOf("two", "one"))
    println(numbers subtract setOf("three", "four"))

}