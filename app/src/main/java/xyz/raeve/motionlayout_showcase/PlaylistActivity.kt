package xyz.raeve.motionlayout_showcase

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_playlist.*

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

class PlaylistAdapter : RecyclerView.Adapter<PlaylistAdapter.SongViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder =
    SongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false))

  override fun getItemCount(): Int = 20

  override fun onBindViewHolder(holder: SongViewHolder, position: Int) {

  }

  inner class SongViewHolder(view: View) : RecyclerView.ViewHolder(view)
}