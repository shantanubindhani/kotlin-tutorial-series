/*
    This file only contains the types of class that koline contains

*/

// Regular Class
// Purpose: Represents a basic structure for modeling objects with properties and behavior.
// Explanation: Regular classes are used to define general-purpose object blueprints. 
//  They can include properties and member functions, providing a versatile way to model entities with specific characteristics and actions.

class Person(val name: String, val age: Int) {
    // Member function to greet the person
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

// Data Class
// Purpose: Represents a class designed specifically for holding data.
// Explanation: Data classes are used when the primary purpose of a class is to hold data.
//  They automatically generate standard utility methods like equals(), hashCode(), toString(), and copy(), making them concise for data-centric scenarios.

data class Point(val x: Int, val y: Int)

// Abstract Class
// Purpose: Defines a base class for other classes to inherit from.
// Explanation: Abstract classes provide a common structure and shared functionality for their subclasses. 
//  They may include abstract functions that must be implemented by the subclasses, enforcing a consistent behavior across derived classes.

abstract class Shape {
    // Abstract function to calculate the area of the shape
    abstract fun calculateArea(): Double
}

// Interface
// Purpose: Defines a contract for classes to implement.
// Explanation: Interfaces specify a set of functions that implementing classes must provide. They allow for multiple inheritance and are useful for achieving abstraction, defining common behavior without specifying the actual implementation.

interface Drawable {
    // Function to draw the object
    fun draw()
}

// Enum Class
// Purpose: Represents a fixed set of constants.
// Explanation: Enum classes are used when you have a predefined and limited set of values. 
//  They provide a concise way to represent a group of related constants, making the code more readable and maintainable.

enum class Color {
    RED, GREEN, BLUE
}

// Sealed Class
// Purpose: Represents a restricted class hierarchy.
// Explanation: Sealed classes are used when you want to define a limited set of subclasses. T
//  hey ensure that all subclasses are known and defined within a specific scope. Sealed classes are beneficial for modeling data with distinct, predefined variations.

sealed class Result {
    // Sealed subclass representing success with data
    data class Success(val data: String) : Result()
    // Sealed subclass representing an error with a message
    data class Error(val message: String) : Result()
}

// Inner Class
// Purpose: Defines a class within another class.
// Explanation: Inner classes are used when a class needs to be closely associated with another class. 
//  They can access the members of the outer class, providing a way to organize and encapsulate related functionality.

class Outer {
    private val outerProperty: Int = 10

    // Inner class with a function accessing the outer property
    inner class Inner {
        fun printOuterProperty() {
            println("Accessing outer property: $outerProperty")
        }
    }
}


fun main() {
    // Regular Class
    val person = Person("Alice", 25)
    person.greet()

    // Data Class
    val point = Point(3, 7)
    println("Point: $point")

    // Abstract Class
    class Circle(val radius: Double) : Shape() {
        override fun calculateArea(): Double {
            return 3.14 * radius * radius
        }
    }
    val circle = Circle(radius = 5.0)
    println("Circle Area: ${circle.calculateArea()}")

    // Interface
    class CircleDrawable : Drawable {
        override fun draw() {
            println("Drawing a circle")
        }
    }
    val circleDrawable = CircleDrawable()
    circleDrawable.draw()

    // Enum Class
    val selectedColor = Color.RED
    println("Selected Color: $selectedColor")

    // Sealed Class
    val result: Result = Result.Success("Data loaded successfully")
    val message = when (result) {
        is Result.Success -> result.data
        is Result.Error -> result.message
    }
    println("Result: $message")

    // Inner Class
    val outer = Outer()
    val inner = outer.Inner()
    inner.printOuterProperty()
}
