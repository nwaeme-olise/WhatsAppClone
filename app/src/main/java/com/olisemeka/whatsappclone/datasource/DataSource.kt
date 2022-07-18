package com.olisemeka.whatsappclone.datasource

import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Chat

object DataSource {

    fun loadChats(): ArrayList<Chat>{
        return arrayListOf(
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
            "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Homelander", "7:09 PM",
                "I reaaaly should start watching the series ;The Boys", "delivered"),
            Chat(R.drawable.my_image, "The Mighty Thor and King Valkyrie Supremacy", "Yesterday",
                "SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "sent"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read")

        )
    }
}