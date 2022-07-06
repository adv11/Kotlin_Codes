fun main(){
    println("Enter first number:")
    val number1 = readLine()!!.toInt()
    println("Enter second number:")
    val number2 = readLine()!!.toInt()

    if(number1 > number2)
        println("Max value is : $number1")
    else
        println("Max value is : $number2")
}