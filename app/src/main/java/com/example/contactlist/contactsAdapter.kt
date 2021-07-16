package com.example.contactlist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator

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
        Picasso.get()
            .load(currentContacts.imageUrl)
            .into(holder.ivContacts)

        holder.cvcontact.setOnClickListener{
            var intent=Intent(context,contactsList::class.java)
            intent.putExtra("name",currentContacts.name)
            intent.putExtra("email",currentContacts.email)
            intent.putExtra("phone",currentContacts.phoneNumber)
            intent.putExtra("imageUrl",currentContacts.imageUrl)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

        }

    override fun getItemCount(): Int {
       return contactsList.size
    }
}
class contactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphoneNumber)
    var ivContacts=itemView.findViewById<ImageView>(R.id.imageView)
    var cvcontact =itemView.findViewById<CardView>(R.id.cvcontact)

}