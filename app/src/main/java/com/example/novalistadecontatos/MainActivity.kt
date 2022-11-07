package com.example.novalistadecontatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novalistadecontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seeAdd.setOnClickListener {
            val intentGoToAddContact = Intent(this, AddContactActivity::class.java)
            startActivity(intentGoToAddContact)
        }

        binding.seeList.setOnClickListener {
            val intentGoToListActivity = Intent(this, ContactListActivity::class.java)
            startActivity(intentGoToListActivity)
        }
    }
}