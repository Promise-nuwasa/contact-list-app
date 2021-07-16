package com.example.contactlist

import android.provider.ContactsContract

data class Contacts(
    var name:String,
    var email:String,
    var phoneNumber:String,
    var imageUrl:String
)