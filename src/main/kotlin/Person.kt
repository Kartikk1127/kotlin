class Person(val firstName: String, val lastName: String)
//if you do not have any properties or arguments in your primary constructor then you don't need a constructor
{
//    val firstName: String
//    val lastName: String
//
//    init {
//        firstName=_firstName
//        lastName=_lastName
//    }
}
fun main() {
    val person = Person("Kartik", "Srivastava") //creating an instance of the Person class
    person.lastName
    person.firstName
}