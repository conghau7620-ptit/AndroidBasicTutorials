package ptit.hau.alertdialogsample

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    var arrayName = mutableListOf<String>(
            "Du Jun", "Yoseob", "Gikwang", "Dong Woon", "Jun Hyung", "Hyunseung"
    )
    var adapter : ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,arrayName)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            deleteItem(position)
        }

    }

    fun deleteItem(position: Int) {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Thông báo")
        alertDialog.setMessage("Bạn có muốn xóa item trên?")
        alertDialog.setPositiveButton("Có",DialogInterface.OnClickListener {
            dialog, which ->
            arrayName.removeAt(position)
            adapter!!.notifyDataSetChanged()
        })
        alertDialog.setNegativeButton("Không",null)
        alertDialog.show()
    }
}
