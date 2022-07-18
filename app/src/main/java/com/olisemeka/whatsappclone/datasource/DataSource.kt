package com.olisemeka.whatsappclone.datasource

import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Call
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

    fun loadCalls(): ArrayList<Call>{
        return arrayListOf(
            Call(R.drawable.my_image, "Kuba Blazczykowski", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Robert Lewandowksi", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Patryk Klimaka", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Patrick Kubucki", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Lazlo Kubala", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Laszlo Kleinheisler", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Bastian Schweini", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM")
        )
    }
}