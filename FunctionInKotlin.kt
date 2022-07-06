fun main(){
    println("Enter first number :")
    val num1 = readLine()!!.toInt()

    println("Enter second number :")
    val num2 = readLine()!!.toInt()

    addNumbers(num1, num2)
}
fun addNumbers(num1:Int, num2:Int){
    println("Addition is : ${num1 + num2}")
}