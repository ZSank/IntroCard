package com.sankapp.introcard.kotlinconcepts

private val nameList: List<String> = listOf("John", "Ram", "sham", "Rham","Rham")

fun main() {
    println(nameList)
    println(nameList.size)
    val name0 = nameList[0]
    println(name0)

    val name3 = nameList[3]
    println(name3)

//    val nameHundred = nameList[100] //gives out of bounds error
//    println(nameHundred)
}