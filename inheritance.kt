/*
    NOTE : kotlin only supports single inheritance (follows after JAVA no wonder ...)
*/


// Base class
open class Animal(val name: String) {
    // Function in the base class
    open fun makeSound() {
        println("$name makes a generic sound")
    }
}

// Derived class inheriting from Animal
class Dog(name: String, val breed: String) : Animal(name) {
    // Overriding function in the derived class
    override fun makeSound() {
        println("$name barks loudly!")
    }

    // Function specific to Dog class
    fun fetch() {
        println("$name is fetching a ball")
    }
}

// Delegation example: Engine class
class Engine {
    fun start() {
        println("Engine started")
    }
}

// Delegating some functionality to Engine class
// in brief, just having the object of that class as a parameter

class Car(private val engine: Engine) {
    fun startCar() {
        // Delegating the start functionality to the Engine class
        engine.start()
        println("Car started")
    }
}

fun main() {
    // Demonstrating single inheritance
    val dog = Dog("Buddy", "Golden Retriever")
    dog.makeSound()
    dog.fetch()

    // Demonstrating delegation
    val carEngine = Engine()
    val car = Car(carEngine)
    car.startCar()
}
