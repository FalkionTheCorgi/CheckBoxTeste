package com.devmasterteam.exerciciocheckbox

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox_color.setOnClickListener {
            if (checkbox_color.isChecked)
                image_android.setColorFilter(Color.CYAN)
            else
                image_android.setColorFilter(Color.BLACK)
        }

    }
}