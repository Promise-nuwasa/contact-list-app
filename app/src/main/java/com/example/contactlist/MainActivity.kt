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
            Contacts("Promise","promise@gmail.com","076543209876","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Florence","flora@gmail.com","09876544443","https://images.unsplash.com/photo-1519699047748-de8e457a634e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fGFmcmljYW4lMjAlMjBiYWJ5JTIwZ2lybHN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Favor","favour@gmail.com","345678900987","https://images.unsplash.com/photo-1571442463800-1337d7af9d2f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8ODl8fGFmcmljYW4lMjAlMjBnaXJsc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"),
            Contacts("Praise","praise@gmail.com","0987654300","https://images.unsplash.com/photo-1507114845806-0347f6150324?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzN8fGFmcmljYW4lMjAlMjBib3lzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Arban","arban@gmail.com","0983937332","https://images.unsplash.com/photo-1515302569996-e150029e73fb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDF8fGFmcmljYW4lMjAlMjBib3lzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),
            Contacts("Noman","noman@gmail.com","07838393922","https://images.unsplash.com/photo-1507836259356-27d1148b6c76?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fGFmcmljYW4lMjAlMjBib3lzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Romase","romase@gmail.com","03039329378","https://images.unsplash.com/photo-1546728150-b3cbeddb6f6d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8ODN8fGFmcmljYW4lMjAlMjBnaXJsc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Bridget","bridget@gmail.com","07839329378","https://images.unsplash.com/photo-1589156191108-c762ff4b96ab?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NjF8fGFmcmljYW4lMjAlMjBnaXJsc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Rodin","rodin@gmail.com","03039329378","https://images.unsplash.com/photo-1528502668750-88ba58015b2f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTI5fHxhZnJpY2FuJTIwJTIwYm95c3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Romase","romase@gmail.com","03039329378","https://images.unsplash.com/photo-1546728150-b3cbeddb6f6d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8ODN8fGFmcmljYW4lMjAlMjBnaXJsc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Devine","devine@gmail.com","03039329378","https://images.unsplash.com/photo-1563525614522-b76b89d81024?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTl8fGFmcmljYW4lMjAlMjBib3lzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contacts("Bethel","bethel@gmail.com","03039329378","https://images.unsplash.com/photo-1549069786-641f4cb652c7?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzB8fGFmcmljYW4lMjAlMjBiYWJ5JTIwZ2lybHN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60")

        )
        var contactAdapter=contactsAdapter(contactsList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter

    }
}