package com.example.intentexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //在gradle用的是viewbinding，所以xml可以不用用<layout>套起來
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //jump to second activity
        binding.button.setOnClickListener {
            //explicit intent
// Method 1 for sending data:
//            val intent = Intent(this, SecondActivity::class.java).apply {
//
//                //pass data to second activity(上面要加一個.apply)
//                putExtra("Name","Weiwei")
//                putExtra("Age",18)
//            }

//Method 2 (bundle) for sending data:
            val intent = Intent(this,SecondActivity::class.java)
            val bundle = Bundle().apply {
                putString("Name","Weiwei")
                putInt("Age",18)
            }
            intent.putExtras(bundle)


            startActivity(intent)
        }

        //open webpage
        binding.button2.setOnClickListener {
            //implicit intent
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://www.google.com.tw")
            startActivity(intent)
        }

        //dial number
        binding.button3.setOnClickListener {
            //implicit intent
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0800123456789")
            startActivity(intent)
        }

    }
}