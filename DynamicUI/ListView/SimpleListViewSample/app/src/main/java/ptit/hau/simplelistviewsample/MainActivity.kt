package ptit.hau.simplelistviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listName = arrayListOf<String>(
            "Yoon Du Jun",
            "Yang Yoseob",
            "Lee Gikwang",
            "Son Dong Woon",
            "Yong Jun Hyung",
            "Jang Hyunseung",
            "IU",
            "Jisoo",
            "Yerin",
            "Joy",
            "Winter"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                listName)

        listView.adapter = adapter
    }
}
