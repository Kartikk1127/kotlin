fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
//    for (interestingThing in interestingThings)
//    {
//        println(interestingThing)
//    }

//    interestingThings.forEach {interestingThing ->
//        println(interestingThing)
//    }

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}