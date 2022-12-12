package com.example.transferdatatonextpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)


        //We need to get data's from main activity so we gotta have getString method
        val receivedMessage = intent.getStringExtra("Description")
          val receivedRole = intent.getStringExtra("Role")
            val receivedAge = intent.getIntExtra("Age",0)

        //to log screen
        Log.e("Message",receivedMessage.toString())
          Log.e("Role",receivedRole.toString())
            Log.e("Age",receivedAge.toString())

        //Creating object with People class and add datas inside of it.
        val first_person = intent.getSerializableExtra("person1") as People //converting serializable interface to people class
          Log.e("Name",first_person.name)
          Log.e("Role",first_person.role)
          Log.e("Age",first_person.age.toString())

    }
}