package com.example.githupappuser

import android.R.id.home
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {

    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        handler.postDelayed(Runnable {
            val pindahMain = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(pindahMain)
            finish()
        }, 2000)
    }
}