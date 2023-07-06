fun main() {
    val name = "Ram"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])

    val age = 20
    val msg = "$name $age"

    println(msg)

    val email = """
        Hello %s
        How
        Are 
        You
    """.trimIndent()

    println(email.format("${name}"))
}