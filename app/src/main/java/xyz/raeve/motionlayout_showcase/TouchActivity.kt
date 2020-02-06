package xyz.raeve.motionlayout_showcase

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class TouchActivity : AppCompatActivity(R.layout.activity_touch) {
    companion object {
        fun getCallingIntent(context: Context?) = Intent(context, TouchActivity::class.java)
    }
}