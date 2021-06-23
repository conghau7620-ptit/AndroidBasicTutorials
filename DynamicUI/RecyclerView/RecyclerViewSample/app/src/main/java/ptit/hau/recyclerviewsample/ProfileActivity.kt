package ptit.hau.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val pos = intent.getIntExtra("pos",0)

        val singer = MainActivity.listSinger[pos]
        imgAvatar2.setImageResource(singer.avatar)
        edtName.setText(singer.name)
        edtBand.setText(singer.band)
        edtBirthday.setText(singer.birthDay.toString())
    }
}
