package ptit.hau.listviewsample

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_profile.*
import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*

class ProfileActivity : AppCompatActivity(){

    var date = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var pos = intent.getIntExtra("pos",0)
        val singer = MainActivity.listSinger[pos]

        imgSinger2.setImageResource(singer.avatar)
        edtName2.setText(singer.name)
        edtBand2.setText(singer.band)
        val dateFormat = SimpleDateFormat("dd/MM/yyyy")
        edtBirthday2.setText(dateFormat.format(date.time))

    }
}
