package ptit.hau.sharedpreferencessample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvGreet.setText("Hi "+ intent.getStringExtra("name") + "!")

        btnLogOut.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val reIntent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(reIntent)
                finish()
            }
        })
    }
}
