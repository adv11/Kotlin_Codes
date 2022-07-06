fun main(){
    val myName = "Akash"

    // method 1
    for(character in myName){
        println(character)
    }

    println()

    // method 2
    for(index in myName.indices){
        println(myName[index])
    }
}