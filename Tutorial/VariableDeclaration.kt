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

    print("Product ID:"+productId+"\nProduct Name:\t"+productName+"\nStock:"+stock+"\nPrice:"+productPrice+"\nDealer:"+productDealer)

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
Process finished with exit code 0
*/
