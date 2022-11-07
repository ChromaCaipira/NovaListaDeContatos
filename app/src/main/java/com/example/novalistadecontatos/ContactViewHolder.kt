package com.example.novalistadecontatos

import androidx.recyclerview.widget.RecyclerView
import com.example.novalistadecontatos.databinding.ItemContactBinding

class ContactViewHolder(
    private val itemContactBinding: ItemContactBinding
): RecyclerView.ViewHolder(itemContactBinding.root) {
    fun bind(contact: Contact){
        itemContactBinding.contactName.text = "Nome: ${contact.name}"
        itemContactBinding.contactPhone.text = "Telefone: ${contact.phone}"
    }
}
