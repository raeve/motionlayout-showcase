package xyz.raeve.motionlayout_showcase

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_playlist.recyclerView
import xyz.raeve.motionlayout_showcase.playlist.PlaylistAdapter

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
  companion object {
    fun getCallingIntent(context: Context?) = Intent(context, DetailActivity::class.java)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    recyclerView.apply {
      layoutManager = LinearLayoutManager(context)
      adapter = PlaylistAdapter()
    }

    ivClose.setOnClickListener {
      finish()
    }
  }
}