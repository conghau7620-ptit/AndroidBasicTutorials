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

    var flag = false
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
        edtBirthday2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                pickDate()
            }
        })

        btnEdit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (!flag) {
                    edtName2.isEnabled = true
                    edtBand2.isEnabled = true
                    edtBirthday2.isEnabled = true
                    btnEdit.setText("Save")
                    flag = true
                }
                else {
                    edtName2.isEnabled = false
                    edtBand2.isEnabled = false
                    edtBirthday2.isEnabled = false
                    btnEdit.setText("Edit")
                    flag = false

                    singer.name = edtName2.text.toString()
                    singer.band = edtBand2.text.toString()
                    singer.birthDay = date

                    MainActivity.listSinger[pos] = singer
                    MainActivity.listSingerAdapter!!.notifyDataSetChanged()

                }
            }
        })

    }

    fun pickDate() {
        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                view, year, month, day ->
                    val dateFormat = SimpleDateFormat("dd/MM/yyyy")
                    date.set(year,month,day)
                    edtBirthday2.setText(dateFormat.format(date.time))
        },date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DATE))
        datePickerDialog.show()
    }
}
