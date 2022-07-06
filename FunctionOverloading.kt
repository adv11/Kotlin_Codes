fun main(){
    println(addition(2, 3))
    println(addition(2.0, 3.0))

    // Named Arguments
    println(addition(a=2, b=30))
    println(addition(b=39, a=93))
}

fun addition(a:Int, b:Int) : Int{
    return a+b
}

fun addition(a:Double, b:Double) : Double{
    return a+b
}