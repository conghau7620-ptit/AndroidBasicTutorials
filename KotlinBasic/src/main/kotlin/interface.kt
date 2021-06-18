//declare
interface MyInterface {
    fun bar()
    fun foo() {
        // optional body
    }
}

//implement
class Child : MyInterface {
    override fun bar() {
        // body
    }
}

//properties
interface MyInterface1 {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child1 : MyInterface1 {
    override val prop: Int = 29
}

//inheritance
interface Named {
    val name: String
}

interface Person1 : Named {
    val firstName: String
    val lastName: String

    override val name: String
                get() ="$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person1

//resolve overriding conflict
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}
