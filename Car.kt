class Car(val type:String, val model:Int, val price:Double,
val milesDrive:Int, val owner:String){
    init {
        println("car object is created.")
    }
    fun getCarPrice():Double{
        val carPrice = this.price - (this.milesDrive.toDouble() * 10)
        return carPrice
    }
}
fun main(){
    val car = Car("BMW", 2015, 10000.0, 105, "Akash Deep")
    println("${car.model} ${car.owner}")
    println(car.getCarPrice())
}