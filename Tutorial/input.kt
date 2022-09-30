package com.example.tutorials

import java.util.Scanner

fun main(){
  println("Enter your name:")
   val inp=Scanner(System.`in`)
    val name=inp.next()
  print("Enter your age...")
     val age=inp.nextInt()

  println("Welcome $name, you are $age years old")
}
/*OUTPUT:
Enter your name:
Emre
Enter your age22
Welcome Emre, you are 22 years old
*/