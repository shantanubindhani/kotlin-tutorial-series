/*
    overloading : compile-time polymorphism ( this is static )
    overriding  : run-time polymorphism ( this is dynamic )
    
*/


// Class with function overloading
class MathOperations {
    // Overloaded function to add two integers
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Overloaded function to add three integers
    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    // Overloaded function to concatenate two strings
    fun concatenate(a: String, b: String): String {
        return "$a$b"
    }
}

// Class with function overriding
// Base class with function to be overridden
open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

// Derived class overriding the function
class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle")
    }
}

fun main() {
    // Function overloading example
    val math = MathOperations()

    val sum1 = math.add(5, 7)
    val sum2 = math.add(3, 8, 2)
    val result = math.concatenate("Hello", "World")

    println("Sum 1: $sum1")
    println("Sum 2: $sum2")
    println("Concatenated Result: $result")

    // Function overriding example
    val genericShape: Shape = Shape()
    val circle: Shape = Circle()

    genericShape.draw()
    circle.draw()
}
