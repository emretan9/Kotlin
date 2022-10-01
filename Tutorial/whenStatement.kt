package com.example.tutorials

import java.util.*

fun main(){
    val inp= Scanner(System.`in`)

    println("Summation for press 1")
    println("Exraction for press 2")
    println("Multiplication for press 3")
    println("Division for press 4")

    val choice=inp.nextInt()
    println("Enter first number")
    val firstNum=inp.nextInt()
    println("Enter second number")
    val secondNum=inp.nextInt()

    when(choice){
        1-> println("Operation is equal to ${firstNum+secondNum} ")
        2-> println("Operation is equal to ${firstNum-secondNum} ")
        3->println("Operation is equal to ${firstNum*secondNum} ")
        4->if(firstNum>secondNum) println("Operation is equal to ${ firstNum/secondNum}") else println("ERROR we cant divide small num to large num")
        else -> println("Enter valid choice")
    }
}
/*OUTPUT:
Summation for press 1
Exraction for press 2
Multiplication for press 3
Division for press 4
4
Enter first number
10
Enter second number
20
ERROR we cant divide small num to large num

Process finished with exit code 0

*/