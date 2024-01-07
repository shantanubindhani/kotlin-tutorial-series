fun main() {
    // Function with parameters and return type
    println("Function with Parameters and Return Type:")
    val sumResult = addNumbers(5, 7)
    println("Sum: $sumResult")

    // Default parameter values
    println("\nFunction with Default Parameter Values:")
    greetUser("John")

    // Named arguments
    println("\nFunction with Named Arguments:")
    displayInfo(name = "Alice", age = 25)

    // Function with varargs
    println("\nFunction with Varargs:")
    printNumbers(1, 2, 3, 4, 5)

    // Lambda Expressions:
    println("\nLambda Expressions:")
    
    // Example 1: Lambda as a variable
    // Defines a lambda function to multiply two integers
    val multiply: (Int, Int) -> Int = { x, y -> x * y }
    // Invokes the lambda and prints the result
    val result = multiply(3, 4)
    println("Result of multiplication: $result")

    // Example 2: Lambda as a parameter to a higher-order function
    // Defines a higher-order function that takes a lambda as a parameter
    val squareResult = operateOnNumber(5) { it * it }
    //                             ^^^^^^^^^^^^^^^^^
    // In this lambda expression, 'it' represents the single parameter (number) passed to the lambda.

    println("Square of the number: $squareResult")

    // Example 3: Lambda with no parameters
    // Defines a lambda with no parameters that prints a simple greeting
    val greet: () -> Unit = { println("Hello, World!") }
    // Invokes the lambda to print the greeting
    greet()

    // Example 4: Lambda with multiple statements
    // Defines a lambda with a parameter that formats and prints a message
    val printMessage: (String) -> Unit = {
        val formattedMessage = "Message: $it"
        println(formattedMessage)
    }
    // Invokes the lambda to print a formatted message
    printMessage("This is a lambda example.")
}

// Function with parameters and return type
// Adds two integers and returns the result
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Function with default parameter values
// Greets the user with a customizable greeting message
fun greetUser(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

// Function with named arguments
// Displays information about a person, including name and age
fun displayInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

// Function with varargs
// Prints a variable number of integers
fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        print("$number ")
    }
    println()
}

// Higher-order function with lambda parameter
// Applies a given operation on a number using a lambda expression
fun operateOnNumber(number: Int, operation: (Int) -> Int): Int {
    return operation(number)
}
