package com.github.phantasmdragon

fun main(args: Array<String>) {

    val numRegex = "\\d+".toRegex()
    val numbers = listOf("led", "42", "666", "4fun").filter(numRegex::matches)

    print("Result is $numbers")
}