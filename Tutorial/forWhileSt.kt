package com.example.tutorials

fun main(){

   for (i in 3..5) print(i)
    println("\n-----------")

    //Increase the number by 5 between 10 and 20.

    var starting=10
    var ending=20
    var increaseBy=5
    for (x in starting..ending step increaseBy) println("counter called a :$x")
    println("\n-----------")

    //Decrease number by 2 from 20 to 10

    for(y in 20 downTo 10 step 2 ) println("counter x:$y")
    println("\n-----------")

    //Until

    for (z in 0 until 5) println("counter z:$z")
    //if we write z in 0 .. 5 it will print -> 0,1,2,3,4,5 but until means "<"
    println("\n-----------")

    //While()

    var counter=9
    while (counter<15){
        println("Counter up to 15 : ${counter++}")
    }

}
/*OUTPUT:
345
-----------
counter called a :10
counter called a :15
counter called a :20

-----------
counter x:20
counter x:18
counter x:16
counter x:14
counter x:12
counter x:10

-----------
counter z:0
counter z:1
counter z:2
counter z:3
counter z:4

-----------
Counter up to 15 : 9
Counter up to 15 : 10
Counter up to 15 : 11
Counter up to 15 : 12
Counter up to 15 : 13
Counter up to 15 : 14

Process finished with exit code 0


*/