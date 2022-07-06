fun main(){
    println("Enter the value of first number:")
    var firstNum : Int = readLine()!!.toInt()
    println("Enter the value of second number:")
    var secondNum : Int = readLine()!!.toInt()

    var temp = firstNum
    firstNum = secondNum
    secondNum = temp
    println("$firstNum, $secondNum")
}