package ptit.hau.checkboxsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cb1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                //isChecked = true when checkBox is checked
                Toast.makeText(this@MainActivity, cb1.text.toString() + " | " +
                                isChecked, Toast.LENGTH_SHORT).show()
            }
        })

        cb2.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(this@MainActivity, cb2.text.toString() + " | " +
                                isChecked, Toast.LENGTH_SHORT).show()
            }
        })


    }
}
