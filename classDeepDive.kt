// Class definition with properties, methods, and constructors
class Person {
    // Properties
    var name: String = ""
    var age: Int = 0

    // Primary Constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // Secondary Constructor (Overloaded)
    constructor(name: String) : this(name, 0) {
        // Additional initialization code, if needed
    }

    // Method
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

// Class with different access modifiers
open class Animal {
    // Public property
    var species: String = ""

    // Private property
    private var isHungry: Boolean = true

    // Protected property
    protected var legCount: Int = 4

    // Internal property
    internal var habitat: String = "Unknown"

    // Public method
    fun makeSound() {
        println("Generic animal sound")
    }

    // Private method
    private fun eat() {
        if (isHungry) {
            println("Eating...")
            isHungry = false
        } else {
            println("Not hungry.")
        }
    }

    // Protected method
    protected fun move() {
        println("Animal is moving.")
    }

    // Internal method
    internal fun sleep() {
        println("Animal is sleeping.")
    }
}

// Subclass inheriting from Animal
class Dog : Animal() {
    // Accessing protected property and method from the superclass
    fun dogInfo() {
        println("Leg count: $legCount, Habitat: $habitat")
        move()
    }
}

fun main() {
    // Creating instances of the classes
    val person = Person("Alice", 25)
    val personWithoutAge = Person("Bob")

    // Accessing properties and methods of the Person class
    person.displayInfo()
    personWithoutAge.displayInfo()

    // Creating an instance of the Dog class
    val myDog = Dog()

    // Accessing properties and methods of the Animal and Dog classes
    myDog.species = "Canine"
    myDog.makeSound()
    myDog.dogInfo()
    myDog.sleep()
}
