//declare properties
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}

//getter setter
class Student {
    var name : String = ""
        get() = field
        set(name: String) {
            field = name
        }
}

fun main() {
    var student = Student()
    student.name = "Hau"
    println(student.name)
}