package com.example.novalistadecontatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.novalistadecontatos.databinding.ItemContactBinding

class ContactAdapter(
    private val contacts: ArrayList<Contact>
): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        val itemContactBinding = ItemContactBinding.bind(view)
        return ContactViewHolder(itemContactBinding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount() = contacts.size
}