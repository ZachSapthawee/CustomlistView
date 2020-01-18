package com.example.customlistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Profile_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_profile)

        val bundle = intent.extras

        //get data from activity
        val intent = intent
        val get_namefacebook = intent.getStringExtra("facebook")
        val get_name_student = intent.getStringExtra("name")
        val get_idstudent = intent.getStringExtra("idstu")
        val get_major = intent.getStringExtra("major")
        val get_email = intent.getStringExtra("email")
        val get_mobilephone = intent.getStringExtra("tel")
        val get_github = intent.getStringExtra("github")
        val get_coverprofile = bundle!!.getInt("coverprofile")
        val get_icon = bundle!!.getInt("icon")

        //get ID from view
        val cover = findViewById<ImageView>(R.id.coverprofile)
        val profile = findViewById<ImageView>(R.id.profile)
        val namefacebook = findViewById<TextView>(R.id.NameProfile)
        val namestudent = findViewById<TextView>(R.id.name)
        val idstudent = findViewById<TextView>(R.id.idstudent)
        val major = findViewById<TextView>(R.id.major)
        val email = findViewById<TextView>(R.id.email)
        val tel = findViewById<TextView>(R.id.tel)
        val github = findViewById<TextView>(R.id.github)

        cover.setImageResource(get_coverprofile)
        profile.setImageResource(get_icon)
        namefacebook.text = get_namefacebook
        namestudent.text = get_name_student
        idstudent.text = get_idstudent
        major.text = get_major
        email.text = get_email
        tel.text = get_mobilephone
        github.text = get_github


    }

}
