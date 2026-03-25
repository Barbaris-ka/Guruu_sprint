package lesson_2

fun main(){
    println("Введите возраст:")
    val age:Int= readln().toInt()
    if (age>= AGE_OF_MAJORITY) {
        println("Добро пожаловать")}

    else { println("Вход запрещён. Подрости ещё")}
    println("=======================================")
    val message:String = if(age>= AGE_OF_MAJORITY) "Добро пожаловать" else "Вход запрещён. Подрости ещё"
    println(message)}
