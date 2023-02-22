package com.example.apl_absensi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun login(view: View) {
        val firli = Intent(this, MainActivity3::class.java)
        startActivity(firli)
    }

    fun exitAppCLICK(view: View) {
            finishAffinity()
            System.exit(0)
        }


}



