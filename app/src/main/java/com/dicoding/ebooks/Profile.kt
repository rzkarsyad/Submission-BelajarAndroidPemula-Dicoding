package com.dicoding.ebooks

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton

class Profile : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }

        val btnBack : ImageButton = findViewById(R.id.backProfile)
        btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.backProfile -> {
                onBackPressed()
            }
        }
    }
}