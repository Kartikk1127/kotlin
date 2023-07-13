open class Vehicle(price: Double, name: String) {
    init {
        println("My name is $name.")
        println("My price is $price")
    }
}

class Audi(price: Double, name: String): Vehicle(price, name){
    fun rideAudi(){
        println("I am audi")
    }
}
class Ford(price: Double, name: String): Vehicle(price, name){
    fun rideFord(){
        println("I am ford")
    }
}
class Mercedes(price: Double, name: String): Vehicle(price, name){
    fun mercedes(){
        println("I am mercedes")
    }
}

fun main() {
    val value1 = Audi(2000000.45, "A4")
    value1.rideAudi()

    println()

    val value2 = Ford(30000.87,"Chevrolet")
    value2.rideFord()
}