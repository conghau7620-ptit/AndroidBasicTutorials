package ptit.hau.listviewsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*
import java.io.Serializable

class ProfileActivity : AppCompatActivity(){

    var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var pos = intent.getIntExtra("pos",0)
        val singer = MainActivity.listSinger[pos]

        imgSinger2.setImageResource(singer.avatar)
        edtName2.setText(singer.name)
        edtBand2.setText(singer.band)
        edtBirthday2.setText(singer.birthDay.toString())

        btnEdit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (!flag) {
                    edtName2.isEnabled = true
                    edtBand2.isEnabled = true
                    btnEdit.setText("Save")
                    flag = true
                }
                else {
                    edtName2.isEnabled = false
                    edtBand2.isEnabled = false
                    btnEdit.setText("Edit")
                    flag = false

                    singer.name = edtName2.text.toString()
                    singer.band = edtBand2.text.toString()
                    MainActivity.listSinger[pos] = singer

                }
            }
        })

    }
}
