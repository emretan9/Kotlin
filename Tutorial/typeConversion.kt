package com.example.tutorials

fun main(){
   var i:Int =42
    var d:Double=42.45
     var f:Float=92.99f

    var result1:Int = d.toInt()
    var result2:Int = f.toInt()
    var result3:Float = i.toFloat()

       println(result1)
       println(result2)
       println(result3)

    //Convertion numeric to String
    var str1= i.toString()
    var str2= d.toString()
    var str3= f.toString()

    //Now they converted to String and pc see them like string
        println("\n"+str1)
        println(str2)
        println(str3)

    //Convertion from String to numeric

    /*You need to be careful when you want to convert from String
     to numeric because Text may include characters.So u should use
     try cathc block in order not to get error */

    var str="EZT99"
    try {
        val number=str.toInt()
        println(number)
    }catch (e:Exception){
        print("there is an error at convertion ")

    }
}
/*OUTPUT:
42
92
42.0

42
42.45
92.99
there is an error at convertion 
Process finished with exit code 0
*/
