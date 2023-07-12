class Person(val firstName: String="Kartikey", val lastName: String = "Srivastava")
//if you do not have any properties or arguments in your primary constructor then you don't need a constructor
{
var nickName: String? = null
    set(value) {
        field = value
        println("the new nickname is $value")
    }
    get(){
        println("the returned value is $field")
        return field
    }
}
fun main() {
    val person = Person() //creating an instance of the Person class
    person.lastName
    person.firstName
    person.nickName="Kartik"
    person.nickName = "New nickname"
    println(person.nickName)
}