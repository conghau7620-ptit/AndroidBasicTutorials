package ptit.hau.explicitintentsample2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        count = intent.getIntExtra("number", 0)
        tvNum2.setText(count.toString())

        btnPlus5.setOnClickListener(this)
        btnCancel.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnPlus5 -> {
                count+=5
                tvNum2.setText(count.toString())
                var reIntent = Intent()
                reIntent.putExtra("newNumber", count)

                setResult(RESULT_OK, reIntent)

            }
            R.id.btnCancel -> {
                finish()
            }
        }
    }

}
