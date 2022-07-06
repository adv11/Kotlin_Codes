fun main(){

    // Storing function into the variable
    var variable = ::sum
    println(variable(2, 3))
}

fun sum(a:Int, b:Int) : Int{
    return a+b
}