fun main(){
    println("Enter your first number:")
    val firstNum = readLine()!!.toInt()
    println("Enter your second number:")
    val secondNum = readLine()!!.toInt()

    println("Enter operation : {+, -, /, %}")

    val result = when(readLine()!!.toString()){
        "+" -> firstNum + secondNum
        "-" -> kotlin.math.abs(firstNum - secondNum)
        "/" -> firstNum / secondNum
        "%" -> firstNum % secondNum
        else -> "Invalid operator"
    }
    println(result)
}