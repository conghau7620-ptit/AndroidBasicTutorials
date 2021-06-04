package ptit.hau.textview

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText(R.string.hello)

        var leftDrawable = getDrawable(R.drawable.ic_snow)
        var topDrawable = getDrawable(R.drawable.ic_snow)
        var righthtDrawable = getDrawable(R.drawable.ic_snow)
        var bottomDrawable = getDrawable(R.drawable.ic_snow)

        specialTextView.setCompoundDrawablesWithIntrinsicBounds(leftDrawable,topDrawable,
                                            righthtDrawable,bottomDrawable)
    }
}
