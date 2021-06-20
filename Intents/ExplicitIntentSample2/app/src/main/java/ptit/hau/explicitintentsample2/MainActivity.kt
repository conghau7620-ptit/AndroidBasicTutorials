package ptit.hau.explicitintentsample2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    final val REQUEST_COUNTER = 76

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnNext.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var count = tvNum.text.toString().toInt()

        when (v?.id) {
            R.id.btnSubtract -> {
                count--
                tvNum.text = count.toString()
            }
            R.id.btnPlus -> {
                count++
                tvNum.text = count.toString()
            }
            R.id.btnNext -> {
                goToNextActivity();
            }
        }
    }

    fun goToNextActivity() {
        var intent= Intent(this, SecondActivity::class.java)
        intent.putExtra("number",tvNum.text.toString().toInt())

        startActivityForResult(intent,REQUEST_COUNTER)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==REQUEST_COUNTER) {
            if (resultCode== RESULT_OK) {
                val newCount = data?.getIntExtra("newNumber",0)

                tvNum.setText(newCount.toString())
            }
        }
    }
}

