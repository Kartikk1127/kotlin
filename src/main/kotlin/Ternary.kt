fun main() {
    val n1 = 100
    val n2 = 200
//    val value = n1>=n2 ? "n1 is greater" : "n2 is greater"   (this is for java
    val value = if(n1>=n2) "n1 is greater" else "n2 is greater"
    println(value)
}