fun main() {
    // If statement
    val number = 10
    println("If Statement:")
    // here it check if the number is greater than 0, if yes then it executes the command inside the if block
    if (number > 0) {
        println("$number is positive.")
    }

    // If-else statement
    val temperature = 25
    println("\nIf-Else Statement:")
    // check if the tempreture is greater than 30, if yes then excecutes the if block or else just executes the else block
    if (temperature > 30) {
        println("It's hot outside.")
    } else {
        println("It's not too hot.")
    }

    // If-else if-else statement, also called as the if-else ladder
    val score = 75
    println("\nIf-Else If-Else Statement:")
    if (score >= 90) { // executes this if condition is true or else proceeds to the next else-if part
        println("Excellent!")
    } else if (score >= 70) { // checks condition, executes if true, otherwise moves to the next else-if part
        println("Good job!")
    } else if (score >= 50) { // same as other else-if, but now it moves to else block as there is no next else-if
        println("You passed.")
    } else { // finally here huh
        println("You need to improve.")
    }

    println("\nOne-liner conditional:")
    // theres also something called as the one liner conditional ( kinda like the ternary operator )
    val start = true;
    //  variable  = if(condition) [value-if-true] else [value-if-false]
    val carStatus = if(start) "Running" else "Stopped"
    println("The car is $carStatus.") 




    // When expression
    // This is the Switch statement of kotlin
    /*
        for those who don't know, it is a very efficient replacement for if-else-if ladder,
        it works very well when you have a single variable and you want to execute several conditional check with it 
        let's just say 5 or 10 or 20 or 100 or so on . . . 
        
        it executes the block which matches the case with variable value.

        syntax : 
            when (variable) {
                case1-value -> command
                case2-value -> command
                .
                .
                .
                else -> command // this here is the default execution, if nothing matches this is executed
            }

    */
    val dayOfWeek = 3
    println("\nWhen Expression:")
    when (dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }

    // When expression with multiple cases
    val month = 8
    println("\nWhen Expression with Multiple Cases:")

    // here instead of concreate values we are using a range of values as the match case
    when (month) {
        in 1..3 -> println("Quarter 1")
        in 4..6 -> println("Quarter 2")
        in 7..9 -> println("Quarter 3")
        in 10..12 -> println("Quarter 4")
        else -> println("Invalid month")
    }

    // When expression with conditions
    val age = 22
    println("\nWhen Expression with Conditions:")

    // as shown here you can aslo use conditionals instead of the match case
    when {
        age < 18 -> println("You are a minor.")
        age in 18..64 -> println("You are an adult.")
        else -> println("You are a senior.")
    }
}
