package com.example.contactlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactsAdapter(var contactsList: List<Contacts>, var context: Context):RecyclerView.Adapter<contactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item,parent,false)
    return contactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
        var currentContacts=contactsList.get(position)
        holder.tvname.text=currentContacts.name
        holder.tvemail.text=currentContacts.email
        holder.tvphonenumber.text=currentContacts.phoneNumber

    }

    override fun getItemCount(): Int {
       return contactsList.size
    }

}
class contactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphoneNumber)
    var cvContacts=itemView.findViewById<RecyclerView>(R.id.rvcontacts)
}