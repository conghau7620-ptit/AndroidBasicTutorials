package ptit.hau.gridviewsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val pos = intent.getIntExtra("pos",0)

        imgAvatar2.setImageResource(MainActivity.listSinger[pos].avatar)
        tvName2.setText(MainActivity.listSinger[pos].name)
        tvBand2.setText(MainActivity.listSinger[pos].band)
        tvBirthDay2.setText(MainActivity.listSinger[pos].birthDay.toString())

    }
}
