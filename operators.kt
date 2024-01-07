fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 5
    println("Arithmetic Operators:")
    println("a + b = ${a + b}")  // Addition
    println("a - b = ${a - b}")  // Subtraction
    println("a * b = ${a * b}")  // Multiplication
    println("a / b = ${a / b}")  // Division
    println("a % b = ${a % b}")  // Modulus

    // Comparison Operators
    println("\nComparison Operators:")
    println("a == b is ${a == b}")  // Equal to
    println("a != b is ${a != b}")  // Not equal to
    println("a > b is ${a > b}")    // Greater than
    println("a < b is ${a < b}")    // Less than
    println("a >= b is ${a >= b}")  // Greater than or equal to
    println("a <= b is ${a <= b}")  // Less than or equal to

    // Logical Operators
    val x = true
    val y = false
    println("\nLogical Operators:")
    println("x && y is ${x && y}")  // Logical AND
    println("x || y is ${x || y}")  // Logical OR
    println("!x is ${!x}")           // Logical NOT

    // Assignment Operators
    var c = 15
    println("\nAssignment Operators:")
    c += 5
    println("c += 5: c = $c")   // c = c + 5
    c -= 3
    println("c -= 3: c = $c")   // c = c - 3
    c *= 2
    println("c *= 2: c = $c")   // c = c * 2
    c /= 4
    println("c /= 4: c = $c")   // c = c / 4
    c %= 2
    println("c %= 2: c = $c")   // c = c % 2

    // Unary Operators
    var d = 7
    println("\nUnary Operators:")
    println("++d: ${++d}")   // Increment
    println("--d: ${--d}")   // Decrement

    // Elvis Operator
    val nullableValue: Int? = null
    val result = nullableValue ?: 0
    println("\nElvis Operator:")
    println("Result: $result")  // If nullableValue is not null, use its value; otherwise, use 0
}
