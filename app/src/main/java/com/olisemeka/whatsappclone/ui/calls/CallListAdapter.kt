package com.olisemeka.whatsappclone.ui.calls

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Call
import de.hdodenhof.circleimageview.CircleImageView

class CallListAdapter(private val context: Context, private val callsList: ArrayList<Call> ):
    RecyclerView.Adapter<CallListAdapter.CallHolder>() {

    inner class CallHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        val contactImage: CircleImageView = itemView.findViewById(R.id.circleImageView_contact)
        val contactName: TextView = itemView.findViewById(R.id.textView_contact_name)
        val callStatus: ImageView = itemView.findViewById(R.id.imageView_call_status)
        val dateAndTimeOfCall: TextView = itemView.findViewById(R.id.textView_date_and_time_of_call)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_calls, parent, false)
        return CallHolder(itemView)
    }

    override fun onBindViewHolder(holder: CallHolder, position: Int) {
        val item = callsList[position]
        holder.contactImage.setImageResource(item.contactImage)
        holder.contactName.text = item.contactName
        holder.dateAndTimeOfCall.text = item.dateAndTimeOfCall
        when (item.callStatus){
            "missed" -> holder.callStatus.setImageResource(R.drawable.call_missed)
            "received" -> holder.callStatus.setImageResource(R.drawable.call_received)
            "sent" -> holder.callStatus.setImageResource(R.drawable.call_sent)
        }
    }

    override fun getItemCount() = callsList.size
}