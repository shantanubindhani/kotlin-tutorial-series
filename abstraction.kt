/*
    what's abstraction you ask?
    
    well, think of it like this, You are able to use a product without actually know how to create it.
    like car for example. most people are able to use a Car without having the knowledge to create it. 

*/


// Abstract class with abstract method
abstract class Shape {
    // Abstract method (no implementation)
    abstract fun draw()

    // Concrete method with implementation
    fun getColor(): String {
        return "Red"
    }
}

// Concrete class implementing the abstract class
class Circle : Shape() {
    // Implementing the abstract method
    override fun draw() {
        println("Drawing a circle")
    }
}

// Another concrete class implementing the abstract class
class Square : Shape() {
    // Implementing the abstract method
    override fun draw() {
        println("Drawing a square")
    }
}

fun main() {
    // Creating instances of concrete classes
    val circle = Circle()
    val square = Square()

    // Calling abstract and concrete methods
    circle.draw()
    println("Color: ${circle.getColor()}")

    square.draw()
    println("Color: ${square.getColor()}")
}
