//when as a statement

//fun main() {
//    val gender = "h"
//    when(gender){
//        "F"-> println("female")
//        "M"-> println("male")
//        else -> {
//            println("Unknown gender")
//        }
//    }
//}

//when as an expression
fun main() {
    val gender = "M"
    val value = when(gender){
        "F"-> "female"
        "M"-> "male"
        else -> {
            "Unknown gender"
        }
    }

    println(value)
}