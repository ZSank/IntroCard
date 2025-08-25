package com.sankapp.introcard.kotlinconcepts

fun main() {
    println("Hello world")
//    highFun2 { println("hello from lambda") }
}

//normal function
fun normalFunction(name: String) {
    println(name)
}

//normal function
fun addingTwoNumN(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

//normal function
fun squareNum(numb: Int): Int {
    val sq = numb * numb
    return sq
}

//lambda function
val addingTwoNum: (Int, Int) -> (Int) = {a: Int, b: Int -> a + b }

//lambda function
val square: (Int) -> Int = { numb: Int -> numb * numb}


//Higher order function
fun highFunction(printName: (Int, Int) -> (Int)) {

}

//Higher order function
fun highFun2 ( printName: () -> Unit) {
    printName()
}

