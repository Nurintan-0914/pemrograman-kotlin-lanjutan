import kotlin.math.PI

fun main(args: Array<String>){
    print("enter the circle's radius (cm): ")
    val radius = readLine()!!.toDouble()
    var circumference = 2 * PI * radius
    var area = PI * radius * radius
    println("the circle's circumprefernce based on the given radius is: " + circumference + " cm")
    println("area of the circle is: " + area + " cm^2")
}