class Person(val firstName: String="Kartikey", val lastName: String = "Srivastava")
//if you do not have any properties or arguments in your primary constructor then you don't need a constructor
{
//    init {
//        println("Init 1")
//    }
//    constructor(): this("Peter","Parker"){
//        println("This is secondary constructor")
//    }
//    init {
//        println("init 2")
//    }
}
fun main() {
    val person = Person() //creating an instance of the Person class
    person.lastName
    person.firstName
}