import kotlin.math.abs

fun main() {
    println("Enter first number:")
    val number1: Int = readLine()!!.toInt()
    println("Enter second number:")
    val number2: Int = readLine()!!.toInt()

    println("Sum of the numbers is : ${number1 + number2}")
    println("Difference of the number is : ${abs(number1 - number2)}")
    println("Multiplication of the numbers is : ${number1 * number2}")
    try {
        println("Division of numbers is : ${number1 / number2}")
    } catch (e : Exception){
        println("Got divide by zero exception.")
    }finally {
        println("The answer will be infinity.")
    }
}