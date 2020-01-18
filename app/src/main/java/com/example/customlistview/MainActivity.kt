package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val name= arrayListOf(
            "OOP","JAVA","KOTLIN"
        )

        val student_name= resources.getStringArray(R.array.student_name)

        val mylistView = findViewById<ListView>(R.id.mylistView)

        //arrayAdapter
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,student_name)

        mylistView.adapter = arrayAdapter as ListAdapter

        mylistView.setOnItemClickListener{ parent,view,position,id ->
            Log.i("Listview Item",position.toString())
            val itemText = parent.getItemAtPosition(position) as String
            Toast.makeText(this, itemText, Toast.LENGTH_SHORT).show()

            //open new Activity
            val i = Intent(this,Profile_Activity::class.java)
            //sent data to new Activity
            i.putExtra("selecttedname",itemText)
            startActivity(i)
        }
    }
}
