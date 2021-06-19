package ptit.hau.listviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListSingerAdapter(private  val context: Context, private val listSinger : MutableList<Singer>)
    : BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = if (convertView!=null) convertView
            else LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        var imgView : ImageView = view.findViewById(R.id.imgView)
        var tvName : TextView = view.findViewById(R.id.tvName)
        var tvBand : TextView = view.findViewById(R.id.tvBand)

        imgView.setImageResource(listSinger[position].img)
        tvName.setText(listSinger[position].name)
        tvBand.setText(listSinger[position].band)



        return view
    }

    override fun getCount(): Int {
        return listSinger.size
    }

    override fun getItem(position: Int): Any {
        return listSinger[position]
    }

    override fun getItemId(position: Int): Long {
        return listSinger[position].id.toLong()
    }
}