fun main() {
    var numbers = mutableListOf(1,2,3)
    var numbersIterator = numbers.iterator()

    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }

    for (i in numbers) {
        println(i)
    }

    numbers.forEach{
        println(it)
    }

    //list iterator
    val num = listOf("one", "two", "three", "four")
    val listIterator = num.listIterator()
    println(listIterator.nextIndex())

    while (listIterator.hasNext()) listIterator.next()

    println(listIterator.nextIndex())
    println(listIterator.previousIndex())

    println("Iterating backwards: ")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

    //multable iterator
    val num1 = mutableListOf("one", "two", "three", "four")
    val mutableIterator = num1.iterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("After removal: $num1")

    //mutable list iterator
    val num2 = mutableListOf("one", "four", "four")
    val mutableListIterator = num2.listIterator()

    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    println(num2)
}