package ptit.hau.explicitintentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                sendMessage(edtMessage.text.toString())
            }
        })
    }

    fun sendMessage(message : String) {
        val intent = Intent(this,SecondActivity::class.java).apply {
            putExtra("message",message)
        }
        startActivity(intent)
    }
}
