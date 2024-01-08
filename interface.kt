/*
    Interfaces define a set of methods that must be implemented by classes that choose to implement the interface. 
    This allows for achieving multiple inheritance and creating a common contract for a group of classes. 

    NOTE : 
        In case of inheritance,
        Kotlin allows for multiple inheritance using interface (huh, again following after java )

*/

// Interface defining a common set of methods
interface Shape {
    // Abstract method for drawing the shape
    fun draw()

    // Abstract method for calculating the area
    fun calculateArea(): Double
}

// Concrete class implementing the Shape interface
class Circle(val radius: Double) : Shape {
    // Implementation of the draw method for a circle
    override fun draw() {
        println("Drawing a circle")
    }

    // Implementation of the calculateArea method for a circle
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

// Another concrete class implementing the Shape interface
class Rectangle(val width: Double, val height: Double) : Shape {
    // Implementation of the draw method for a rectangle
    override fun draw() {
        println("Drawing a rectangle")
    }

    // Implementation of the calculateArea method for a rectangle
    override fun calculateArea(): Double {
        return width * height
    }
}

fun main() {
    // Create instances of classes implementing the Shape interface
    val circle = Circle(radius = 5.0)
    val rectangle = Rectangle(width = 4.0, height = 6.0)

    // Call methods defined in the Shape interface
    circle.draw()
    println("Circle Area: ${circle.calculateArea()}")

    rectangle.draw()
    println("Rectangle Area: ${rectangle.calculateArea()}")
}
