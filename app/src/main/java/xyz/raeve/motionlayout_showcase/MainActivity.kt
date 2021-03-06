package xyz.raeve.motionlayout_showcase

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_activity.view.*
import xyz.raeve.motionlayout_showcase.playlist.PlaylistActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    recyclerView.apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = ActivityAdapter(
        listOf(
          ActivityModel(
            "Touch",
            "Change elements through click",
            TouchActivity.getCallingIntent(this@MainActivity)
          ),
          ActivityModel(
            "Detail",
            "Use frame position to move elements in a particular time",
            DetailActivity.getCallingIntent(this@MainActivity)
          ),
          ActivityModel(
            "Playlist",
            "Do you like Spotify?",
            PlaylistActivity.getCallingIntent(this@MainActivity)
          )
        ),
        this@MainActivity::onClickActivity
      )
      addItemDecoration(
        DividerItemDecoration(
          this@MainActivity,
          LinearLayoutManager.VERTICAL
        )
      )
    }
  }

  private fun onClickActivity(intent: Intent) {
    startActivity(intent)
  }
}

class ActivityAdapter(
  private val listModel: List<ActivityModel>,
  private val onClick: (Intent) -> Unit
) :
  RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ActivityViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
  )

  override fun getItemCount(): Int = listModel.size

  override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
    val model = listModel[position]
    holder.bind(model)
    holder.itemView.setOnClickListener {
      onClick(model.intent)
    }
  }

  inner class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: ActivityModel) = itemView.apply {
      tvTitle.text = model.title
      tvDescription.text = model.description
    }
  }
}

data class ActivityModel(val title: String, val description: String, val intent: Intent)