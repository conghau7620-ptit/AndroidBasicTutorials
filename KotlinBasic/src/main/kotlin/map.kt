fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)

    val numbersMap1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredKeysMap = numbersMap1.filterKeys { it.endsWith("1") }
    val filteredValuesMap = numbersMap1.filterValues { it < 10 }

    println(filteredKeysMap)
    println(filteredValuesMap)

    val numbersMap3 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap3.put("three", 3)
    println(numbersMap3)

    val numbersMap4 = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    numbersMap4.putAll(setOf("four" to 4, "five" to 5))
    println(numbersMap4)

    val numbersMap5 = mutableMapOf("one" to 1, "two" to 2)
    val previousValue = numbersMap5.put("one", 11)
    println("value associated with 'one', before: $previousValue, after: ${numbersMap5["one"]}")
    println(numbersMap5)

    val numbersMap6 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap6["three"] = 3     // calls numbersMap6.put("three", 3)
    numbersMap6 += mapOf("four" to 4, "five" to 5)
    println(numbersMap6)

    val numbersMap7 = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    numbersMap7.remove("one")
    println(numbersMap7)
    numbersMap7.remove("three", 4)            //doesn't remove anything
    println(numbersMap7)
}