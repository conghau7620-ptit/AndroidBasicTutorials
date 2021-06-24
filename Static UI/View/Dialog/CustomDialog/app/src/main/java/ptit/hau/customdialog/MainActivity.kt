package ptit.hau.customdialog

import android.animation.ValueAnimator
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btnClick.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                randomNumber()
            }
        })
    }

    val listCrush = mutableListOf(
        R.drawable.iu,
        R.drawable.jisoo,
        R.drawable.yerin,
        R.drawable.joy,
        R.drawable.winter
    )

    fun randomNumber() {
        var dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_custom)


        var imgView : ImageView = dialog.findViewById(R.id.imgView)
        var btnRandom : Button = dialog.findViewById(R.id.btnRandom)

        btnRandom.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val rand = Random.nextInt(5)
                imgView.setImageResource(listCrush[rand])
            }
        })

        dialog.show()
    }

}
