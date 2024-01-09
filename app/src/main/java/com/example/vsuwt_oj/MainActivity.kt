package com.example.vsuwt_oj

fun main() 
{
    //Работа с преобразованием строк
    val str1: String = "Hello"
    val str2: String = "Kotlin"
    val concatenatedString: String = str1 + " " + str2
    println("Сцепленная строка: $concatenatedString")
    //Базовая арифметика и вывод результата в консоль
    val num1: Int = 10
    val num2: Int = 5
    val sum: Int = num1 + num2
    println("Сумма чисел $num1 и $num2 равна $sum")
    //Примеры интерполяции строк
    val name: String = "John"
    val age: Int = 25
    println("Привет, меня зовут $name и мне $age лет")
    //Преобразование типов
    val floatNumber: Float = 10.5f
    val intNumber: Int = floatNumber.toInt()
    println("Преобразование float в int: $intNumber")
    //Пример условных операторов (if else)
    val x: Int = 7
    if (x > 5) 
    {
        println("$x больше 5")
    } 
    else 
    {
        println("$x меньше или равно 5")
    }
    //Пример с циклами (for while)
    for (i in 1..5) 
    {
        println("Итерация $i")
    }
    var counter = 0
    while (counter < 3) 
    {
        println("Цикл while, итерация $counter")
        counter++
    }
    //Пример создания отдельной функции
    greetUser("Alice")
    //Пример работы с массивом
    val numbersArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (number in numbersArray) 
    {
        println("Элемент массива: $number")
    }
}
//Отдельная функция
fun greetUser(name: String) 
{
    println("Привет, $name!")
}
