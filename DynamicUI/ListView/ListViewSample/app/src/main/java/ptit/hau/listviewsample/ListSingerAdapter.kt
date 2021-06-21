package ptit.hau.listviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListSingerAdapter(val context: Context, val listSinger : MutableList<Singer>)
    :BaseAdapter(){
    override fun getCount(): Int {
        return listSinger.size
    }

    override fun getItem(position: Int): Any {
        return listSinger[position]
    }

    override fun getItemId(position: Int): Long {
        return listSinger[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(
                        R.layout.list_item, parent, false)

        view.let {
            val tvName : TextView = view.findViewById(R.id.tvName)
            val tvBand : TextView = view.findViewById(R.id.tvBand)
            val imgSinger : ImageView = view.findViewById(R.id.imgSinger)

            tvName.text = listSinger[position].name
            tvBand.text = listSinger[position].band
            imgSinger.setImageResource(listSinger[position].avatar)
        }

        return view!!
    }
}