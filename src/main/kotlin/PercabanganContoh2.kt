fun main(args: Array<String>){
    println("Enter a number between 10-20: ")
    val a = readLine()!!.toInt()
    if (a >= 10 && a <= 20){
        println("the condition has been met.")
    } else {
        println("you did it wrong.")
    }

    println("\nEnter  number between 10-20 or 20-40: ")
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >= 30) && (b <= 40))){
        println("The condition has been met.")
    } else{
        println("you did it wrong.")
    }
}