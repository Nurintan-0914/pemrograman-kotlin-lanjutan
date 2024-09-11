fun main(args: Array<String>){
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("mybeNumber: ${maybeNumber?.hashCode()}")
}