package com.example.variable

fun main(){
    var studentName = "Emre"
    var studentAge = 23
    var studentHeight = 1.98 //If you want to decclare float u must type 'f' at the end
    var stuFirstLetter = 'E'
    print("Welcome\t"+studentName+"\nYour age is\t"+studentAge)
    println("\n---------------------------------------------")
    //Other type

    var productId : Int = 1907
    var productName : String = "Rolex watch"
    var stock : Int = 1000
    var productPrice :Double = 149.99 //or Float 149.99f
    var productDealer :String = "Rolex"

    println("Product ID:"+productId+"\nProduct Name:\t"+productName+"\nStock:"+stock+"\nPrice:"+productPrice+"\nDealer:"+productDealer)
    println("---------------------------------------------")

    //Printing Variables

    var name="Emre"
    var age=22
    //We can add variable into print function with "$"
    println("$name is $age years old.")

    //If we want to make process in print func use "${}"
    var a=5
    var b=4
    println("a+b equals to ${a+b}")
    println("---------------------------------------------")

    //Constants

    val clorineRate:Double =4.15 //constant value declaration like that.
    println("Clorine rate of pool is $clorineRate")
    println("---------------------------------------------")


}

/*OUTPUT:
Welcome	Emre
Your age is	23
---------------------------------------------
Product ID:1907
Product Name:	Rolex watch
Stock:1000
Price:149.99
Dealer:Rolex
---------------------------------------------
Emre is 22 years old.
a+b equals to 9
---------------------------------------------
Clorine rate of pool is 4.15
---------------------------------------------
Process finished with exit code 0
*/
