fun main(args: Array<String>){
    println("Exponent calculator")
    println("===================")
    println("enter the base: ")
    val a = readLine()!!.toInt()
    println("Enter the base: ")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1..n-1){
        result = result * a
    }
    println("result: $result")
    println("thank you for using our exponent calculator")
}