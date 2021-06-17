import javax.naming.Context
import javax.print.attribute.AttributeSet

open class Base1() {
}

class Derived1 (p:Int) : Base1()

open class View {
    constructor(ctx: Context)
    constructor(ctx: Context, attrs: AttributeSet)
}

class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

//override method
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

open class Rectangle() : Shape() {
    final override fun draw() { /*...*/ }
}

//override property
open class Shape1 {
    open val vertexCount: Int = 0
}

class Rectangle1 : Shape1() {
    override val vertexCount = 4
}

interface Shape2 {
    val vertexCount: Int
}

class Rectangle2(override val vertexCount: Int = 4) : Shape2 // Always has 4 vertices

class Polygon2 : Shape2 {
    override var vertexCount: Int = 0  // Can be set to any number later
}

//derived class initialization order
open class Base(val name: String) {

    init { println("Then block init of Base class is excuted") }

    open val size: Int =
        name.length.also { println("Then property of Base class is initialized") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.also { println("Then this code will be excuted 2nd") }) {

    init { println("Then block init of Derived class is excuted") }

    override val size: Int =
        (super.size + lastName.length).also { println("Then property of Derived class overrides") }
}

fun main() {
    println("Program excutes this code first")
    Derived("hello", "world")
}

//calling superclass implementation
open class Rectangle3 {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle3 : Rectangle3() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

//inner class accesses superclass of outer class
open class Rectangle4 {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle4: Rectangle4() {
    override fun draw() {
        val filler = Filler4()
        filler.drawAndFill()
    }

    inner class Filler4 {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle4.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle4.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}

//override rule
open class Rectangle5 {
    open fun draw() { /* ... */ }
}

interface Polygon5 {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square5() : Rectangle5(), Polygon5 {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle5>.draw() // call to Rectangle.draw()
        super<Polygon5>.draw() // call to Polygon.draw()
    }
}