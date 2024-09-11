fun main(args: Array<String>){
    //continue & break label
    println("example of break and continue label")
    myLabel@ for (x in 1..10){
        if (x == 5){
            println("i am inside if block with value" +x +"\n-- hence it will close the operation")
            break@myLabel
        } else {
            println("i am inside else block with value" +x)
            continue@myLabel
        }
        println("Not print")
    }
}