package ptit.hau.radiobuttonsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                val rbChecked : RadioButton = rg.findViewById(checkedId)
                Toast.makeText(this@MainActivity,"Hau is " +
                                rbChecked.text.toString(),Toast.LENGTH_SHORT).show()
            }
        })
    }
}
