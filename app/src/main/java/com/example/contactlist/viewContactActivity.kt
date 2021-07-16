package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)

        var tvName =findViewById<TextView>(R.id.tvName)
        var tvemail=findViewById<TextView>(R.id.tvemail2)
        var tvphone=findViewById<TextView>(R.id.tvphone2)
        var imgUrl = findViewById<ImageView>(R.id.imageView2)

        var nameIntent=intent.getStringExtra("name")
        var emailIntent = intent.getStringExtra("email")
        var phoneIntent= intent.getStringExtra("phone")
        var imgeIntent=intent.getStringExtra("imageUrl")
        picasso.get().looad(imageUrl).into(imgUrl)


        tvName.text=nameIntent
        tvemail.text=emailIntent
        etphone.text=phoneIntent


    }

}