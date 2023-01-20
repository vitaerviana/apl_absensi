package com.example.apl_absensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun ini(view: View){
        val firli = Intent(this,MainActivity3::class.java)
        startActivity(firli)
    }
    fun itu(view: View){
        val firli = Intent(this,MainActivity4::class.java)
        startActivity(firli)
    }
}