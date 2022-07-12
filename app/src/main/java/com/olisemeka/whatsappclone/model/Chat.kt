package com.olisemeka.whatsappclone.model

import androidx.annotation.DrawableRes

data class Chat(
    @DrawableRes
    val contactImage: Int,
    val contactName: String,
    val timeOfLastMessage: String,
    val lastMessage: String,
    val lastMessageStatus: String
)