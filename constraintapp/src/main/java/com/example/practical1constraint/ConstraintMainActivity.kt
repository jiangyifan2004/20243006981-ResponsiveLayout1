package com.example.practical1constraint

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View

class ConstraintMainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.BLACK
        window.navigationBarColor = Color.rgb(255, 248, 255)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        }
        setContentView(R.layout.activity_constraint_main)
    }
}
