fun main() {
    var me = Person("Hau")
    var myChild = Person("Mango",me)
    println("""
        I'm ${me.name},
        I have a child named ${me.children.get(0).name}
    """.trimIndent())
}

class Person(name: String) {
    var children : MutableList<Person> = mutableListOf()
    var name = ""

    constructor(nameChild: String, father: Person) : this(nameChild) {
        father.children.add(this)
        println("Then secondary constructor is excuted.")
    }

    init {
        this.name = name
        println("This block code will be excuted before secondary constructor.")
    }

}