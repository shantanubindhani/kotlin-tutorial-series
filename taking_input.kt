fun main(){
    print("Enter author : ")
    var auth = readLine()

    // to take inputs which are not string, we just take the string input and convert them into desired variable type
    // for conversion we use readLine()!!to[datatype]()
    // like so
    print("Enter number : ")
    var intNumber = readLine()!!.toInt()
    print("Enter decimal : ")
    var doubleNumber = readLine()!!.toDouble()
    print("Enter Boolean (true/false) : ")
    var bool = readLine()!!.toBoolean()

    println("author : $auth  | digit : $intNumber  | decimal : $doubleNumber | Boolean : $bool")
}