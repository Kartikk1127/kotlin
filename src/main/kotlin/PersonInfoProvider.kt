interface PersonInfoProvider{
    val providerInfo: String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): String
}

//here class implements the interface
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    //    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
}