package com.example.presensiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttPresensi = findViewById<Button>(R.id.btn_presensi)
        val buttLihatPresensi = findViewById<Button>(R.id.butt_lihatPresensi)
        buttPresensi.setOnClickListener(){
            val intent = Intent(this, CheckPresensi::class.java)
            startActivity(intent)
        }
        buttLihatPresensi.setOnClickListener(){
            val intent = Intent(this, RiwayatPresensi::class.java)
            startActivity(intent)
        }
    }
}