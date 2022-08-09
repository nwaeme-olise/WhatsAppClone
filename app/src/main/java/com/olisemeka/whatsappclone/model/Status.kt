package com.olisemeka.whatsappclone.model

import androidx.annotation.DrawableRes

data class Status(
    @DrawableRes val contactImage: Int,
    val contactName: String,
    val timeOfLastUpdate: String
)