
//Kotlin Functions

fun main(args : Array<String>){
    // It is standard library function
    var num = 25
    var result1 = Math.sqrt(num.toDouble())
    println("The sqare root of $num is $result1")

    // It is user define function
    sum()

}
fun sum()
{
    var a = 2
    var b = 3
    var c = (a+b)
    println("The sum is : "+c)
}