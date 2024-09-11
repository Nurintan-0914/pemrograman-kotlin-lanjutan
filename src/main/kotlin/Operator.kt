//tambah operator !!
//fun main(args: Array<String>){
//    var maybeNumber: Int? = 15
//    println(maybeNumber!! * 2)
//
//    maybeNumber = null
//    println(maybeNumber!! * 2)
//}

//pemeriksaan kondisi null
//fun main(args: Array<String>){
//    var maybeNumber: Int? = 15
//    if (maybeNumber != null)
//        println(maybeNumber * 2)
//    else
//        println("the entered value isn't a number")
//}


//Pemanggilan yang aman (safe calls)
//fun main (args: Array<String>){
//    var maybeNumber: Int? = 15
//    maybeNumber?.let{ println(it) }
//
//}


//Elvis Operator(?:)
fun main(args: Array<String>){
    var maybeWelcome: String? = "Hello world"
    println(maybeWelcome?.length ?: 0)
}
