import kotlin.math.sqrt

fun main (args: Array<String>){
    print("enter some number and i'll calculate a square root: ")
    val a = readLine()!!.toDouble()
    if (a > 0){
        println("the number you entered is greater than 0, so i cn calculate it!")
        val root = sqrt (a);
        println("the square root of $a is $root")
    } else
        println("i can't calculate the square root of a negative number!")
    println("thanks for the input")
}