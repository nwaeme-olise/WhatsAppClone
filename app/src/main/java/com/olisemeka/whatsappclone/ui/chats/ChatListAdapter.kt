package com.olisemeka.whatsappclone.ui.chats

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Chat
import de.hdodenhof.circleimageview.CircleImageView

class ChatListAdapter(private val context: Context, private val chatList: ArrayList<Chat>):
    RecyclerView.Adapter<ChatListAdapter.ChatHolder>() {

    inner class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage: CircleImageView = itemView.findViewById(R.id.circleImageView_contact)
        val contactName: TextView = itemView.findViewById(R.id.textView_contact_name)
        val timeOfLastMessage: TextView = itemView.findViewById(R.id.textView_time_of_last_message)
        val lastMessage: TextView = itemView.findViewById(R.id.textView_last_message)
        val lastMessageStatusImage: ImageView = itemView.findViewById(R.id.imageView_last_message_status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_chats, parent, false)
        return ChatHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        val item = chatList[position]
        holder.apply {
            contactImage.setImageResource(item.contactImage)
            contactName.text = item.contactName
            timeOfLastMessage.text = item.timeOfLastMessage
            lastMessage.text = item.lastMessage
            when (item.lastMessageStatus){
                "sent" -> lastMessageStatusImage.setImageResource(R.drawable.tick)
                "delivered" -> lastMessageStatusImage.setImageResource(R.drawable.double_tick)
                "read" -> lastMessageStatusImage.setImageResource(R.drawable.blue_double_tick)
            }
        }
    }

    override fun getItemCount() = chatList.size

    }


