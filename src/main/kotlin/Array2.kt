fun main(args: Array<String>){
    //creates an Array<String> with sizes 5 values ["0", "1", "4", "9", "16"]
    val asc = Array(5){
        i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}