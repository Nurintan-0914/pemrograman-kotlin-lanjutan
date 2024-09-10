fun min(args: Array<String>){
    println("Welcome to our calculator")
    println("enter the first number:");
    val a = readLine()!!.toDouble()
    println("enter the second number:")
    val b = readLine()!!.toDouble()
    println("choose one of the following operations:")
    println("1 - addition")
    println("2 - substraction")
    println("3 - multiplication")
    println("4 - division")
    val choice = readLine()!!.toInt()
    var result = 0.0
    when (choice){
        1 -> result = a + b
        2 -> result = a - b
        3 -> result = a * b
        4 -> result = a / b
    }
    if ((choice > 0) && (choice < 5)){
        println("Result: $result")
    } else{
        println("Invalid choice")
    }
    println("thank you using for using our calculator.")
}