fun main() {
    // For loop - Range-based
    println("For Loop - Range-based:")
    for (i in 1..5) {
        println("Iteration $i")
    }

    // For loop - Collection-based
    val fruits = listOf("Apple", "Banana", "Orange")
    println("\nFor Loop - Collection-based:")
    for (fruit in fruits) {
        println(fruit)
    }

    // For loop - with index
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println("\nFor Loop - with Index:")
    for ((index, value) in numbers.withIndex()) {
        println("Index $index: $value")
    }

    // While loop
    var count = 0
    println("\nWhile Loop:")
    while (count < 3) {
        println("Count: $count")
        count++
    }

    // Do-while loop
    var x = 0
    println("\nDo-While Loop:")
    do {
        println("Value of x: $x")
        x++
    } while (x < 3)

    // Repeat loop
    println("\nRepeat Loop:")
    repeat(3) {
        println("Iteration $it")
    }

    // Nested loops
    println("\nNested Loops:")
    for (i in 1..3) {
        for (j in 1..2) {
            println("i: $i, j: $j")
        }
    }

    // Loop control statements
    println("\nLoop Control Statements:")
    for (i in 1..5) {
        if (i == 3) {
            continue  // Skip the current iteration when i is 3
        }
        if (i == 5) {
            break     // Terminate the loop when i is 5
        }
        println("Iteration $i")
    }
}
