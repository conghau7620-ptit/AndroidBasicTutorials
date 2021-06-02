fun main() {
    println("1 + 1 = " + sum(1,1))
    showInfo("My journey","Hau cute", "Hau handsome")
}

fun sayHi(name: String){
    println("Hi, I'm $name")
}

fun sayHi(name: String, age: Int) {
    println("Hi, I'm $name. I'm $age.")
}

fun showInfo(book: String, vararg authors: String) {
    println("$book - Authors: ")
    authors.forEach { println("+ " +it) }
}

fun sum(a: Int =1, b: Int=2) :Int {
    return a+b
}