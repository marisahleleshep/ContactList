package com.example.displayingcontactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.displayingcontactlist.databinding.ActivityMainBinding
import com.example.displayingcontactlist.ContactAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    private fun displayContacts(){
        val contact1=ContactData("","Marisa","072345145")
        val contact2=ContactData("","Brenda","072145642")
        val contact3=ContactData("","Annete","0712421451")
        val contact4=ContactData("","Brian","0732412126")
        val contact5=ContactData("","Leila","0712514215464")
        val contact6=ContactData("","Bahati","0721432542")
        val contact7=ContactData("","Collins","0715435632")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val tvAdapter= ContactAdapter(contactList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=tvAdapter
    }
}