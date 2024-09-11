fun main(args: Array<String>){
    val listNumber = listOf(1,2,3,4,5,6)
    println("jumlah nilai pada elemen listNumber = ${getSum(listNumber)}")
}

fun getSum(values: List<Int>) : Int {
    var total = 0;
    for (i in values) total += 1
    return total
}