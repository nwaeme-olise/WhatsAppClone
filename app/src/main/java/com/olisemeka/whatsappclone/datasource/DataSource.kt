package com.olisemeka.whatsappclone.datasource

import com.olisemeka.whatsappclone.R
import com.olisemeka.whatsappclone.model.Call
import com.olisemeka.whatsappclone.model.Chat
import com.olisemeka.whatsappclone.model.Contact
import com.olisemeka.whatsappclone.model.Status

object DataSource {

    fun loadChats(): ArrayList<Chat>{
        return arrayListOf(
            Chat(R.drawable.my_image, "Nwaeme Olisemeka", "8:09 PM",
            "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_one, "Cool Dude", "7:09 PM",
                "I reaaaly should start watching the series ;The Boys", "delivered"),
            Chat(R.drawable.image_two, "The Mighty Thor and King Valkyrie Supremacy", "Yesterday",
                "SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "sent"),
            Chat(R.drawable.image_three, "John Okafor", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_four, "Anthony", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_five, "Mera Hartford", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_six, "Khan Kamala", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_seven, "Muneeba", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_eight, "Stephanie", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_nine, "Sophia", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read"),
            Chat(R.drawable.image_ten, "Moise Kean", "8:09 PM",
                "How far my guy? How are you doing? How have you been?", "read")

        )
    }

    fun loadCalls(): ArrayList<Call>{
        return arrayListOf(
            Call(R.drawable.image_ten, "Kuba Blazczykowski", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.image_nine, "Robert Lewandowksi", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.image_eight, "Patryk Klimaka", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Patrick Kubucki", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Lazlo Kubala", "sent", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Laszlo Kleinheisler", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.image_one, "Bastian Schweini", "missed", "Yesterday, 4:59 PM"),
            Call(R.drawable.image_two, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.image_three, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM"),
            Call(R.drawable.my_image, "Kuba Blazczykowski", "received", "Yesterday, 4:59 PM")

        )

    }

    fun loadStatuses(): ArrayList<Status>{
        return arrayListOf(
            Status(R.drawable.image_one, "Tochukwu", "18 minutes ago"),
            Status(R.drawable.image_ten, "Titi", "30 minutes ago"),
            Status(R.drawable.image_two, "Jide", "45 minutes ago"),
            Status(R.drawable.image_nine, "Fidel Castro", "1 hour ago"),
            Status(R.drawable.image_three, "Che Adams", "2 hours ago"),
            Status(R.drawable.image_seven, "Reece James", "Today, 6:20 AM"),
            Status(R.drawable.image_four, "Rhys Williams", "Yesterday, 7:30 PM")
        )

    }

    fun loadContacts(): ArrayList<Contact>{
        return arrayListOf(
            Contact(R.drawable.image_one, "Tochukwu", " "),
            Contact(R.drawable.image_ten, "Titi", "Available"),
            Contact(R.drawable.image_two, "Jide", "Hey, I'm on WhatsApp!"),
            Contact(R.drawable.image_nine, "Fidel Castro", "Soy El Commandante"),
            Contact(R.drawable.image_three, "Che Adams", "Premier League footballer"),
            Contact(R.drawable.image_seven, "Reece James", "Invisible striker"),
            Contact(R.drawable.image_four, "Rhys Williams", "Liverpool center-back"),
        )
    }
}