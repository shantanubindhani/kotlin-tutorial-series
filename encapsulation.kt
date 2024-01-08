/*
    Now Encapsulation is just a way to restrict the usage of parts of the program only where they are needed
    so we use classes, access specifiers etc to limit the scope and range.

    in a real world example, a company shares it's project details within itself but doesn't allow that to be shared outside

*/

// BankAccount class represents a simple bank account with encapsulation

class BankAccount {
    // Private property to store the account balance
    private var balance: Double = 0.0

    // Public getter for retrieving the account balance
    fun getBalance(): Double {
        return balance
    }

    // Public method for depositing funds into the account
    fun deposit(amount: Double) {
        // Ensure that the deposit amount is positive
        if (amount > 0) {
            balance += amount
        }
    }

    // Public method for withdrawing funds from the account
    fun withdraw(amount: Double): Boolean {
        // Ensure that the withdrawal amount is positive and does not exceed the account balance
        if (amount > 0 && amount <= balance) {
            balance -= amount
            return true  // Withdrawal successful
        }
        return false  // Withdrawal failed
    }
}

fun main() {
    // Create an instance of the BankAccount class
    val account = BankAccount()

    // Deposit funds into the account
    account.deposit(1000.0)

    // Display the current account balance
    println("Current Balance: ${account.getBalance()}")

    // Withdraw funds from the account
    val withdrawalAmount = 500.0
    if (account.withdraw(withdrawalAmount)) {
        println("Withdrawal of $withdrawalAmount successful")
    } else {
        println("Insufficient funds for withdrawal")
    }

    // Display the updated account balance after withdrawal
    println("Updated Balance: ${account.getBalance()}")
}
