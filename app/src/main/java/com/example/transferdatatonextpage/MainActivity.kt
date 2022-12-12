package com.example.transferdatatonextpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //Creating button
     val buttonSend= findViewById<Button>(R.id.buttonSend)
     //Giving action to button
        buttonSend.setOnClickListener {
            //creating object from People class
            val person1 = People("Emre Tanrikulu","Software Developer",22)
            //creating intent to go other activity
            val new_intent = Intent(this@MainActivity,ActivityB::class.java)

            //old method that adding strings one by one.
            new_intent.putExtra("Description","Kevin Durant")
                new_intent.putExtra("Role","Basketball Player")
                  new_intent.putExtra("Age",32)

            //Proper method that sends data to other activity
            new_intent.putExtra("person1",person1)
            startActivity(new_intent)

        }


    }
}