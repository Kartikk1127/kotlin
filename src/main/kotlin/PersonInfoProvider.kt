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
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    //    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }
    override val providerInfo: String
        get() = "BasicInfoProvider"

   protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }
    else
    {
        println("is a session info provider")
//        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}