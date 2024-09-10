fun main(args: Array<String>){
    //conditions
    if (15 > 5)
        println("true")
    println("the program continues here...")

    //if-else
    val a: Int = 5
    val b: Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " + max)

    //if - else if
    var myVar: Int = 0
    if (myVar == 0) {
        myVar = 1
    } else if (myVar == 1){
        myVar = 0
    } else {
        myVar = -1
    }

    println("Nilai myVar adalah " + myVar)

    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("the number you entered is greater than 5!")
    println("thanks for the input")
}