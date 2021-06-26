package ptit.hau.activitylifecyclesample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnSub.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val num = Integer.parseInt(tvNum.text.toString())
        when (v!!.id) {
            R.id.btnPlus -> {
                tvNum.setText(""+(num+1))
            }
            R.id.btnSub -> {
                tvNum.setText(""+(num-1))
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val num = tvNum.text.toString()
        outState.putString("number",num)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val num = savedInstanceState.getString("number")
        tvNum.setText(num)
    }
}
