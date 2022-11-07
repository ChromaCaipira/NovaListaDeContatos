package com.example.novalistadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novalistadecontatos.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val contact = Contact(
                binding.edtName.text.toString(),
                binding.edtPhone.text.toString()
            )
            contacts.add(contact)
            binding.txtResult.text = "Contato adicionado!"
        }
    }
}