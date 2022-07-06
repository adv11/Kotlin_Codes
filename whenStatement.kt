fun main(){
    println("Enter any number:")
    val number = readLine()!!.toInt()

    when(number%10){
        1, 3, 5, 7, 9 -> println("It is odd number")
        else -> println("It is even number")
    }
}