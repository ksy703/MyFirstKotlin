package com.example.myfirstkotlin.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.myfirstkotlin.R
import kotlinx.android.synthetic.main.layout_first.*

class FirstActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_first)

        hello_world_btn.setOnClickListener(){
            Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show()
        }

    }
}