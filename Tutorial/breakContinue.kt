package com.example.tutorials

fun main(){

    //Break ends the loop
    var index=0

    while (index<5){
        println("Result :$index")
        index+=1
        if (index==3) break
    }

    println("---------------------")

    //Continue passes the process

    for(i in 5..10){
        if(i==8){
            continue
        }
        println("i is $i")
    }
    //Also you should use them into if statement
}
/*OUTPUT:
Result :0
Result :1
Result :2
---------------------
i is 5
i is 6
i is 7
i is 9
i is 10

Process finished with exit code 0

 */