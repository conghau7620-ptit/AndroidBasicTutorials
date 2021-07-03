package ptit.hau.gridviewbasicsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listName = listOf<String>(
            "Du Jun", "Yoseob", "Gikwang", "Dong Woon", "Jun Hyung", "Hyunseung",
            "IU", "Jisoo", "Yerin", "Joy", "Winter"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
            listName)

    }
}
