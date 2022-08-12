package com.olisemeka.whatsappclone.model

import androidx.annotation.DrawableRes

data class Contact(
    @DrawableRes val contactImage: Int,
    val contactName: String,
    val contactBio: String
)