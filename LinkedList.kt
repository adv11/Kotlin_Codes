import java.util.LinkedList

fun main(){
    val names = LinkedList<String>()
    do{
        println("Enter name or type exit:")
        val name = readLine().toString()
        if(name != "exit"){
            names.add(name)
        }
    }while (name != "exit")

    for(name in names){
        println(name)
    }
}