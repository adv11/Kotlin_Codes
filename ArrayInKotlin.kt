fun main(){
//    var studentNames = arrayOf("Akash Deep Vishwakarma", "Abhishek Patel", "Anurag Singh Bhadauriya", "Bhavisha", "Ashish Patwa")
//    for(studentName in studentNames){
//        println(studentName)
//    }
//
//    println()
//
//    studentNames[3] = "Bhavisha Bhatia"
//    for(studentName in studentNames){
//        println(studentName)
//    }

    println("Enter the size of the array:")
    val size = readLine()!!.toInt()
    val name : Array<String> = Array(size){""}
    println("Enter the student names:")
    for(i in 0 until size){
        name[i] = readLine().toString()
    }

    for(studentName in name){
        println(studentName)
    }
}