package ptit.hau.buttonsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                //do something

                //show toast message at the bottem of screen
                Toast.makeText(this@MainActivity,
                    "Clicked",Toast.LENGTH_LONG).show()
            }
        })

        button.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {
                Toast.makeText(this@MainActivity,"Long clicked",Toast.LENGTH_LONG).show()
                return true
            }
        })


    }
}
