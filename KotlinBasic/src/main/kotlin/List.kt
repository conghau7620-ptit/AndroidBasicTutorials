fun main() {
    val numbers = listOf(1, 2, 3, 4, 2, 5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))

    println(numbers.indexOfFirst { it > 2})
    println(numbers.indexOfLast { it % 2 == 1})

    val numbers2 = mutableListOf("B", "D", "G", "E")
    numbers2.sort()
    println(numbers2)
    println(numbers2.binarySearch("G"))  // 3
    println(numbers2.binarySearch("H")) // -5
    println(numbers2.binarySearch("K", 0, 2))  // -3

    val productList = listOf(
        Product("WebStorm", 49.0),
        Product("Web", 99.0),
        Product("AppCode", 99.0),
        Product("DotTrace", 129.0),
        Product("ReSharper", 149.0))

    println(productList.binarySearch(Product("AppCode", 99.0),
        compareBy<Product> { it.price }.thenBy { it.name }))

    val numbers3 = mutableListOf("one", "five", "six")
    numbers3.add(1, "two")
    numbers3.addAll(2, listOf("three", "four"))
    numbers3.forEach{ print("$it ")}
    println()

    val numbers4 = mutableListOf("one", "five", "three")
    numbers4[1] =  "two"
    println(numbers4)

    val numbers5 = mutableListOf(1, 2, 3, 4)
    numbers5.fill(3)
    println(numbers5)

    val numbers6 = mutableListOf(1, 2, 3, 4, 3)
    numbers6.removeAt(1)
    println(numbers6)

    val numbers7 = mutableListOf("one", "two", "three", "four")

    numbers7.sort()
    println("Sort into ascending: $numbers7")
    numbers7.sortDescending()
    println("Sort into descending: $numbers7")

    numbers7.sortBy { it.length }
    println("Sort into ascending by length: $numbers7")
    numbers7.sortByDescending { it.last() }
    println("Sort into descending by the last letter: $numbers7")

    numbers7.sortWith(compareBy<String> { it.length }.thenBy { it })
    println("Sort by Comparator: $numbers7")

    numbers7.shuffle()
    println("Shuffle: $numbers7")

    numbers7.reverse()
    println("Reverse: $numbers7")
}

data class Product(val name: String, val price: Double)
