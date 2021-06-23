package ptit.hau.recyclerviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class SingerAdapter (
    val context: Context,
    val listSinger : MutableList<Singer>,
    val listener: OnItemClickListener
)
    : RecyclerView.Adapter<SingerAdapter.GameHolder>(){

    class GameHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgView : CircleImageView = view.findViewById(R.id.imgAvatar)
        var tvName : TextView = view.findViewById(R.id.tvName)
        var tvBand : TextView = view.findViewById(R.id.tvBand)

        fun binData(singer: Singer) {
            imgView.setImageResource(singer.avatar)
            tvName.setText(singer.name)
            tvBand.setText(singer.band)
        }
    }

    interface OnItemClickListener {
        fun onClick(singer: Singer, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        val view = LayoutInflater.from(context).inflate(
                R.layout.list_item,parent,false)
        return GameHolder(view)
    }

    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        holder.binData(listSinger[position])

        holder.itemView.setOnClickListener {
            listener.onClick(listSinger[position],position)
        }
    }

    override fun getItemCount(): Int {
        return listSinger.size
    }
}