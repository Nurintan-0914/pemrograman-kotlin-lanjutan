fun main(args: Array<String>){
    println("welcome to our calculator")
    println("enter the first number: ")
    val a = readLine()!!.toDouble()
    println("Enter the second number:");
    val b = readLine()!!.toDouble()
    println("choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - devision")
    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1){
        result = a + b
    } else if (choice == 2){
        result = a - b
    } else if (choice == 3){
        result = a * b
    } else if (choice == 4){
        result = a/b
    }
    if ((choice > 0) && (choice < 5)){
        println("result: $result")
    } else
    {
        println("result: $result")
    }
    println("thank you for using our calculator.")
}