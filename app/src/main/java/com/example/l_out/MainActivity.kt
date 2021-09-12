package com.example.l_out

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butn = findViewById<Button>(R.id.b2)
        val value ="hello world"
        //Thread.sleep(7000)
        butn!!.setOnClickListener(View.OnClickListener {

            val data = Intent(this ,MainActivity2::class.java)

            startActivity(data)
        })
    }

}