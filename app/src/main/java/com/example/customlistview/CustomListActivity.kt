package com.example.customlistview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customlistview.Adapter.StudentAdapter
import com.example.customlistview.Model.Students
import kotlinx.android.synthetic.main.activity_custom_list.*
import kotlinx.android.synthetic.main.activity_profile.*


class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var Students:Students =
            Students("Zak Sapthawee",
                "นายทรัพย์ทวี  เพ็ชรสาย",
                "603410203-8",
                "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
                "p_sapthawee@kkumail.com",
                "098-1892325",
                "https://github.com/Zaksapthwee",
                R.drawable.zakprofile,
                R.drawable.zakprofile)

        var  liststudent = mutableListOf<Students>()

        liststudent.add(Students)


        Log.i("tag",Students.toString())

        var  listView :ListView = findViewById(R.id.Listview) //listview
        listView.adapter = StudentAdapter(this,R.layout.listitem_student,liststudent)
        Listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id ->


            //Value of item that is clicked
            val facebook = liststudent[position].namefacebook
            val name = liststudent[position].name
            val idstudent = liststudent[position].idstudent
            val major = liststudent[position].major
            val email = liststudent[position].email
            val mobilephone = liststudent[position].mobilephone
            val github = liststudent[position].github
            val coverprofile = liststudent[position].coverprofile
            val icon = liststudent[position].icon
            
            //Toast the Values
            Toast.makeText(this,
                "Facebook :" +liststudent[position].namefacebook+"\nProfile :  "+liststudent[position].name, Toast.LENGTH_SHORT).show()

            //Intent
            var profile = Intent(this,Profile_Activity::class.java)
            profile.putExtra("facebook",facebook)
            profile.putExtra("name",name)
            profile.putExtra("idstu",idstudent)
            profile.putExtra("major",major)
            profile.putExtra("email",email)
            profile.putExtra("tel",mobilephone)
            profile.putExtra("github",github)
            profile.putExtra("coverprofile",coverprofile)
            profile.putExtra("icon",icon)
            startActivity(profile)
            Log.i("tag",profile.toString())

        }
    }
}
