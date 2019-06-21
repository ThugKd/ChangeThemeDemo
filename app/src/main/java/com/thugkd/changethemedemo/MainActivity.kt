package com.thugkd.changethemedemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeNightMode(view : View) {
        MApplication.switchNightMode()
        Intent(this, MainActivity::class.java).run {
            startActivity(this)
            overridePendingTransition(0,0)
            finish()
        }
    }
}
