package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//Method 1 for retrieving data:
//        val name = intent.getStringExtra("Name")
//        //getIntExtra needs default value
//        val age = intent.getIntExtra("Age",0)

//Method 2 (bundle) for retrieving data:
        val bundle = intent.extras
        val name = bundle?.getString("Name")
        val age = bundle?.getInt("Age")

        Toast.makeText(this, "Name: $name, Age: $age",Toast.LENGTH_SHORT).show()
    }
}