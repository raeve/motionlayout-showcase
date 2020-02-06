package xyz.raeve.motionlayout_showcase.playlist

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_playlist.*
import xyz.raeve.motionlayout_showcase.R

class PlaylistActivity : AppCompatActivity(R.layout.activity_playlist) {
  companion object {
    fun getCallingIntent(context: Context?) = Intent(context, PlaylistActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    recyclerView.apply {
      layoutManager = LinearLayoutManager(context)
      adapter = PlaylistAdapter()
    }
  }
}

