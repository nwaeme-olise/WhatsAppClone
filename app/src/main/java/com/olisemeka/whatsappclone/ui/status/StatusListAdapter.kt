package com.olisemeka.whatsappclone.ui.status

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Status
import de.hdodenhof.circleimageview.CircleImageView

class StatusListAdapter(private val statusList: ArrayList<Status>):
    RecyclerView.Adapter<StatusListAdapter.StatusHolder>() {
    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage: CircleImageView = itemView.findViewById(R.id.circleImageView_contact)
        val contactName: TextView = itemView.findViewById(R.id.textView_contact_name)
        val timeOfLastUpdate: TextView = itemView.findViewById(R.id.textView_time_of_last_status_update)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_status, parent, false)
        return StatusHolder(itemView)
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        val item = statusList[position]
        holder.contactImage.setImageResource(item.contactImage)
        holder.contactName.text = item.contactName
        holder.timeOfLastUpdate.text = item.timeOfLastUpdate
    }

    override fun getItemCount() = statusList.size
}