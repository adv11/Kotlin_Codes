import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter your name :")
    val studentName = reader.nextLine()
    println("Enter your age : ")
    val studentAge : Int = reader.nextInt()

    println("Student Name : $studentName, Student Age : $studentAge")
}