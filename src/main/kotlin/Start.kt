
//Create a list of integers, transform it into a list of strings, and print them one by one

fun main() {

    val intList = listOf<Int>(1,2,3,4,5,6,7,8,9,100)

    intList.map {it.toString()}.forEach { it -> println("$it") }}