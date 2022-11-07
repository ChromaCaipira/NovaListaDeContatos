package com.example.novalistadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novalistadecontatos.databinding.ActivityContactListBinding

class ContactListActivity : AppCompatActivity() {

    lateinit var binding: ActivityContactListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}