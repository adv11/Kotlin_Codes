fun main(){
    val studentName = ArrayList<String>()
    do{
        println("Enter the name or type exit:")
        val name = readLine().toString()
        if(name != "exit"){
            studentName.add(name)
        }
    }while (name != "exit")


    for(name in studentName){
        println(name)
    }
}