package com.example.novalistadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.novalistadecontatos.databinding.ActivityContactListBinding

class ContactListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contactList.adapter?.notifyItemChanged(contacts.size - 1)

        binding.contactList.adapter = ContactAdapter(
            contacts
        )
        binding.contactList.layoutManager = LinearLayoutManager(this)
    }
}