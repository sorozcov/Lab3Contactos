package com.example.silvi.contactapplication

import android.app.Application

internal class ContactApplication : Application() {

    companion object {
        var contacts = arrayListOf<Contact>();
        var contactSelected = Contact("","","");
    }
}