package com.example.tutorials

import java.util.Scanner

fun main(){
    while(true) {
        println("Enter a number to see whether is odd or even")
        val inp = Scanner(System.`in`)
        var num = inp.nextInt()

        val sum = num % 2

        if (sum == 0)
            println("This number is even!")
        if(sum == 1)
            println("This number is odd!")

        println("Press (1) to exit - press any different number to continue")
        val choice=inp.nextInt()

        if(choice==1){
            println("GOODBYE!")
            break
        }

    }
}
/*OUTPUT:
Enter a number to see whether is odd or even
5
This number is odd!
Press (1) to exit - press any different number to continue
2
Enter a number to see whether is odd or even
4
This number is even!
Press (1) to exit - press any different number to continue
1
GOODBYE!

Process finished with exit code 0



 */

