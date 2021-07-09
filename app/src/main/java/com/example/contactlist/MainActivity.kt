package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContacts=findViewById(R.id.rvcontacts)
        var contactsList= listOf(
            Contacts("Promise","promise@gmail.com","076543209876"),
            Contacts("Florence","flora@gmail.com","09876544443"),
            Contacts("Favor","favour@gmail.com","345678900987"),
            Contacts("Praise","praise@gmail.com","0987654300"),
            Contacts("Arban","arban@gmail.com","098765432")

        )
        var contactAdapter=contactsAdapter(contactsList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter

    }
}