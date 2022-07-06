fun main(){
    // immutable list - can not change
    var immutableList = listOf<String>("Akash", "Deepak", "Pooja", "Abhishek")
    for(name in immutableList){
        println(name)
    }

    println()

    // mutable list - can change
    var mutableList = mutableListOf<String>("Akash", "Deepak", "Pooja", "Abhishek")
    mutableList[3] = "Arti"
    for(name in mutableList){
        println(name)
    }
}