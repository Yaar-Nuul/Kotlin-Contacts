package com.akirachix.mycontact

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontact.databinding.ActivityMainBinding
import com.akirachix.mycontacts.ContactsAdapter


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvContacts.layoutManager = LinearLayoutManager(this)
        displayContacts()
    }
    fun displayContacts(){
        val contact1 = Contact("Annet","0783430955", "annet@gmail.com", "")
        val contact2 = Contact("Zach","0783430955", "zach@gmail.com", "")
        val contact3 = Contact("Shalom","0783430955", "shalom@gmail.com", "")
        val contact4 = Contact("Yvette","0783430955", "yvette@gmail.com", "")
        val contact5 = Contact("Anita","0783430955", "anit@gmail.com", "")
        val contact6 = Contact("Fiona","0783430955", "fio@gmail.com", "")
        val contact7 = Contact("Boniface","0783430955", "boni@gmail.com", "")
        val contact8 = Contact("Lynne","0783430955", "lynne@gmail.com", "")
        val contact9 = Contact("Daniel","0783430955", "daniel@gmail.com", "")
        val contact10 = Contact("Juliet","0783430955", "jules@gmail.com", "")
        val contact11 = Contact("Samantha","0783430955", "sam@gmail.com", "")
        val contactList = listOf(contact1, contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.tvContacts.adapter = contactsAdapter
    }
}