
// Comments : comments are statements that are ignored by the compiler, 
//  kinda like NOTES for describing specific parts of program
//  which doesn't affect the syntax and functioning of the program.

// TYPES OF COMMENTS : 
//  this is a single line comment

/*  
    This is a
    Multiline comment
*/

/**
 * 
 *  This is a Document comment
 *  What are document comments? 
 *      well, document comments are the type of comments that are mostly used for documentation purpose
 *      if you already know what documentation is then well and good,
 *      otherwise you can know more about them here [ https://kotlinlang.org/docs/kotlin-doc.html ]
 * 
 */


/*   
  every kotlin program begin with a starting line, 
  withing this language we call this a `main` function 
*/

//  NOTE : kotlin doesn't use semicolons for termination, whew, what a relief!!

fun main(){
    // output 
    // there are two main methods for output
    println("======================================================")
    println("1. println() : it prints the output in a new line.")
    // escape code like \n \s \t also work here
    print("2. print() it prints the output in the same line \n")
    println("\n"); // gives you 2 lines worth of space HA!

    /*
        DataTypes
            Int : for integer types
                ( 2, 4, 5, etc )
            Double : for decimal types
                ( 2.2, 4.123, etc )
            Char : single characters (enclosed with singel quotes)
                ( 'a', 'A', '8', '>' etc )
            Boolean : true/false
                [ true, false ]
            String : and array of `Char` (enclosed with double quotes)
                ( "abcd", "hi", "string-err", "m@G16x", etc ) 

    */

    // DECLARATIONS
    //  Dynamic declaration : the compiler automatically detects the datatype
    var a = 'a'
    var b = "bee"  // yes we use the `var` keyword
    var c = 67
    // what's dynamic in this?
    // well you can reassign values (must contain same datatype) without a worry
    a = 'b'
    b = "see" // something like this

    // static of constant declaration
    // instead of `var` keyword, 
    // we use `val` keyword.
    val new_variable = "throws an error if you try to assign a new value to this."

    /*
        Restricting the variables to only one datatype : explicit
        NOTE : the compiler does this implicitly (by itself) after it receives a value
    
        Benefits?
            better variable and compiler utilization
            less confusing
            better way to keep track of variable type
            less mess to work with
            let's just that this is better overall
        
        syntax?
            var/val variable_name : datatype = value
    */
    val author : String = "BLANK"
    var year : Int = 2024
    var month = 1
    var day = 6
    // NOW printing the variables 
    println("author : ${author} (by string formating)")
    println("date : $day/$month/" + year + " (by concatination)\n")
    
    println("======================================================")

}