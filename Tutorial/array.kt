package com.example.tutorials

import java.util.Scanner

fun main(){
    /*
    * Arrays structure has constant dimension.Dimension of array is obvious at the begining.
    * Mutable
    */
    val array1 = Array<Int>(5){0}//U can declare array type and size
     val array2= arrayOf(1,2,3,4,5,6)//If u dont want u can code like that
      val array3= arrayOf<Int>(9,8,7)//U can also declare type of arrayOf
       val array4 = arrayOf<String>("Emre","Tanrıkulu")//String array
        val array5= arrayOf(5,9,"kd",78.2)//U can add different type of array element into array
    //If u want to modify your array,make your array "val" to "var"

    //Combined arrays
         val three_pointers= arrayOf<String>("seth curry","joe harris","royce o'neal")
          val super_stars = arrayOf<String>("Kevin durant","Kyrie irving")
           val players = three_pointers+super_stars
          println(java.util.Arrays.toString(players))
        println("Other type of printing array is ${players.contentToString()}")
      println("Our best player is ${super_stars.get(0)}")//U can also get specific array element with .get() method.

        three_pointers[1]="D'angelo Russel" // we cannot add new element(due to size) but we can change the element
          println("New three pointer is -> ${three_pointers.get(1)}")
            three_pointers.set(2,"luka doncic")//other type of editing element
              println("New thre pointer is -> ${three_pointers.get(2)}")

    //Other array processes
      println(players.isEmpty())//It will return true or false whether this array is empty or not
        println("How many players we have? ${players.count()}")
          println("My first name is ${array4.first()}, my surname is ${array4.last()}")
            println("Position of the kevin durant at our team with index number ${players.indexOf("Kevin durant")}")
              println("Is nets contains James harden?(true/false) ${players.contains("James harden")}")
              players.sort()
            println("Arrange players with alphabetical order ${players.contentToString()}")
    //Also u can copy array with creating new array and newarray.clone() method

    println("-----------------------------------------------------------------------")

    //Loops with Arrays
      val cars=arrayOf<String>("Bmw","Mercedes","Audi","Rolls Royce")
        for ((index,car) in cars.withIndex()){
            println("Brands no$index : $car")
        }
    println("-----------------------------------------------------------------------")

    //Inputting array elements
      val inp=Scanner(System.`in`)
        val best_players= Array<String>(5){""}// double quote means that it will create array like {" "," "}
          for (i in 0 until  best_players.count()){
              println("Enter your ${i+1}. fav player:")
                val name=inp.next()
                  best_players[i]=name
          }
          for ((index,name) in best_players.withIndex()){
              println("My ${index+1}. fav player is $name")
          }
}
/*OUTPUTS:
[seth curry, joe harris, royce o'neal, Kevin durant, Kyrie irving]
Other type of printing array is [seth curry, joe harris, royce o'neal, Kevin durant, Kyrie irving]
Our best player is Kevin durant
New three pointer is -> D'angelo Russel
New thre pointer is -> luka doncic
false
How many players we have? 5
My first name is Emre, my surname is Tanrıkulu
Position of the kevin durant at our team with index number 3
Is nets contains James harden?(true/false) false
Arrange players with alphabetical order [Kevin durant, Kyrie irving, joe harris, royce o'neal, seth curry]
-----------------------------------------------------------------------
Brands no0 : Bmw
Brands no1 : Mercedes
Brands no2 : Audi
Brands no3 : Rolls Royce
-----------------------------------------------------------------------
Enter your 1. fav player:
kobe
Enter your 2. fav player:
mj
Enter your 3. fav player:
lebron
Enter your 4. fav player:
kd
Enter your 5. fav player:
kai
My 1. fav player is kobe
My 2. fav player is mj
My 3. fav player is lebron
My 4. fav player is kd
My 5. fav player is kai

Process finished with exit code 0


 */