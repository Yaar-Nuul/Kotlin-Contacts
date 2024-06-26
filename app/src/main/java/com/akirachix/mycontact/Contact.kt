package com.akirachix.mycontact

import android.provider.ContactsContract.CommonDataKinds.Email

data class Contact(
    var name: String,
    var phoneNumber: String,
    var email: String,
    var image: String
)
