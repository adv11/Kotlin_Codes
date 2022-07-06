fun main(){
    val nameFreq = HashMap<String, Int>()

    do{
        println("Enter name or type exit")
        val name = readLine().toString()
        if(name != "exit"){
            if(!nameFreq.containsKey(name)){
                nameFreq[name] = 1
            }else{
                nameFreq[name] = nameFreq.getValue(name)+1
            }
        }
    }while (name != "exit")


    for(name in nameFreq){
        println(name.key + " " + name.value)
    }
}