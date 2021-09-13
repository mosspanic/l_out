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
        val butn = findViewById<Button>(R.id.floatingActionButton3)
        butn!!.setOnClickListener(View.OnClickListener {

            val data = Intent(this ,MainActivity2::class.java)

            startActivity(data)
        })
    }

}
//ic_baseline_power_settings_new_24