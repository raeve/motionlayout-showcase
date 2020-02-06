package xyz.raeve.motionlayout_showcase.playlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.raeve.motionlayout_showcase.R

class PlaylistAdapter : RecyclerView.Adapter<PlaylistAdapter.SongViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder =
    SongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false))

  override fun getItemCount(): Int = 20

  override fun onBindViewHolder(holder: SongViewHolder, position: Int) {

  }

  inner class SongViewHolder(view: View) : RecyclerView.ViewHolder(view)
}