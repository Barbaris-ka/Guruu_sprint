package lesson_2

fun main(){
    println("Введите возраст:")
    val age:Int= readln().toInt()

println("Совершенолетие достигнуто ${age>=AGE_OF_MAJORITY}")
}
const val AGE_OF_MAJORITY:Int=18