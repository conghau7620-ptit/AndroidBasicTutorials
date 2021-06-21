package ptit.hau.listviewsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    companion object { var listSinger : MutableList<Singer> = mutableListOf<Singer>(
        Singer(1,"Yoon Du Jun", "Highlight", null, R.drawable.dujun),
        Singer(2,"Yang Yoseob", "Highlight", null, R.drawable.yoseob),
        Singer(3,"Lee Gikwang", "Highlight", null, R.drawable.gikwang),
        Singer(4,"Son Dong Woon", "Highlight", null, R.drawable.dongwoon),
        Singer(5,"Yong Jun Hyung", "Solo", null, R.drawable.junhyung),
        Singer(6,"Jang Hyunseung", "Solo", null, R.drawable.hyunseung),
        Singer(7,"IU", "Solo",null,R.drawable.iu),
        Singer(8,"Jisoo", "Black Pink", null, R.drawable.jisoo),
        Singer(9,"Yerin","Solo", null, R.drawable.yerin),
        Singer(10,"Joy","Red Velvet", null, R.drawable.joy),
        Singer(11, "Winter", "Aespa", null, R.drawable.winter)
    ) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listSingerAdapter = ListSingerAdapter(this,listSinger)
        listView.adapter = listSingerAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,ProfileActivity::class.java).apply {
                putExtra("pos",position)
            }
            startActivity(intent)
        }
    }
}
