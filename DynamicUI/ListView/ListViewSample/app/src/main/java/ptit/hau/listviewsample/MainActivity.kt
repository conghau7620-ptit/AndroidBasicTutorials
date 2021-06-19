package ptit.hau.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listSinger = mutableListOf<Singer>(
        Singer(0,"Yoon Du Jun","Highlight",R.drawable.dujun),
        Singer(1,"Yang Yoseob", "Highlight", R.drawable.yoseob),
        Singer(2,"Lee Gikwang", "Highlight", R.drawable.gikwang),
        Singer(3,"Son Dong Woon", "Highlight", R.drawable.dongwoon),
        Singer(4,"Yong Jun Hyung", "Solo", R.drawable.junhyung),
        Singer(5,"Jang Hyunseng","Solo", R.drawable.hyunseung),
        Singer(6,"IU","Solo",R.drawable.iu),
        Singer(7,"Jisoo", "Black Pink", R.drawable.jisoo),
        Singer(8,"Yerin", "Solo", R.drawable.yerin),
        Singer(9,"Joy","Red Velvet", R.drawable.joy),
        Singer(10,"Winter","Aespa", R.drawable.winter)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ListSingerAdapter(this,listSinger)
        listView.adapter = adapter


    }
}
