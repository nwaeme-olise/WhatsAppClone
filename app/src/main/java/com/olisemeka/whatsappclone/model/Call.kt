package com.olisemeka.whatsappclone.model

import androidx.annotation.DrawableRes


data class Call(
        @DrawableRes
        val contactImage: Int,
        val contactName: String,
        val callStatus: String,
        val dateAndTimeOfCall: String
)