package com.example.displayingcontactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//import com.example.contactList.databinding.ContactListItemBinding
import com.example.displayingcontactlist.databinding.ContactListBinding

class ContactAdapter(var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        var binding=holder.binding
        binding.tvName.text=currentContact.name
        binding.tvPhone.text=currentContact.phone

    }

}

class ContactViewHolder(var binding: ContactListBinding):RecyclerView.ViewHolder(binding.root)