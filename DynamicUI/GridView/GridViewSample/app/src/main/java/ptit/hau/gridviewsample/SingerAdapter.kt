package ptit.hau.gridviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class SingerAdapter(val context: Context, val listSinger: MutableList<Singer>)
    : BaseAdapter(){
    override fun getCount(): Int {
        return listSinger.size
    }

    override fun getItem(position: Int): Any {
        return listSinger[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(
                    R.layout.grid_item,parent,false)

        view.let {
            val imgAvatar : ImageView = view.findViewById(R.id.imgAvatar)

            imgAvatar.setImageResource(listSinger[position].avatar)
        }

        return view
    }
}