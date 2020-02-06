package xyz.raeve.motionlayout_showcase

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class PlaylistActivity : AppCompatActivity(R.layout.activity_case1) {
    companion object {
        fun getCallingIntent(context: Context?) = Intent(context, PlaylistActivity::class.java)
    }
}