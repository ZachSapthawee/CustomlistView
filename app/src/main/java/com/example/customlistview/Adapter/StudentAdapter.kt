package com.example.customlistview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.example.customlistview.Model.Students
import com.example.customlistview.R

public class StudentAdapter (var mCtx: Context,
                             var resource:Int,
                             var items:List<Students>)
    : ArrayAdapter<Students>(mCtx,resource,items){
    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup): View {

        val layout:LayoutInflater = LayoutInflater.from(mCtx)
        val v: View = layout.inflate(resource,null)
        val icon: ImageView = v.findViewById(R.id.studentphoto)
        val name: TextView = v.findViewById(R.id.namestudent)
        val idstudent: TextView = v.findViewById(R.id.idstudent)

        val students:Students = items[position]

        name.text = students.name
        idstudent.text = students.idstudent
        icon.setImageDrawable(mCtx.getDrawable(students.icon))
        return v

    }
}

//var => change value
//val => final