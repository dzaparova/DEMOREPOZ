var myMap:HashMap<String,String>?=null
fun main (){
    val names= arrayOf("KG","RU","USA", "TR")
    val codes= arrayOf("+996","+7","+1","+90")
    myMap= hashMapOf()

    codes.indices.forEach{
        myMap?.put(names[it],codes[it])
    }
    myMap?.forEach{
        println("${it.key} ${it.value}")
    }
    println("My first commit ")
    println("My first commit ")
    println("My first commit ")
    println("My first commit ")
    println("My first commit ")
    println("My first commit ")
}