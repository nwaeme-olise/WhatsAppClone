package com.olisemeka.whatsappclone.ui.calls

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Contact
import de.hdodenhof.circleimageview.CircleImageView

class NewCallListAdapter(private val contactList: ArrayList<Contact>):
    RecyclerView.Adapter<NewCallListAdapter.ContactHolder>() {
    inner class ContactHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage: CircleImageView = itemView.findViewById(R.id.circleImageView_contact)
        val contactName: TextView = itemView.findViewById(R.id.textView_contact_name)
        val contactBio: TextView = itemView.findViewById(R.id.textView_contact_bio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_new_call, parent, false)
        return ContactHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        val item = contactList[position]
        holder.contactImage.setImageResource(item.contactImage)
        holder.contactName.text = item.contactName
        holder.contactBio.text = item.contactBio
    }

    override fun getItemCount() = contactList.size
}