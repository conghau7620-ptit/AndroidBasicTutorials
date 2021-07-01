package ptit.hau.animationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgView.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                var anim_alpha = AnimationUtils.loadAnimation(this@MainActivity,
                    R.anim.anim_alpha)
                var anim_rotate = AnimationUtils.loadAnimation(this@MainActivity,
                    R.anim.anim_rotate)
                var anim_scale = AnimationUtils.loadAnimation(this@MainActivity,
                    R.anim.anim_scale)
                var anim_translate = AnimationUtils.loadAnimation(this@MainActivity,
                    R.anim.anim_translate)
                var anim_mix = AnimationUtils.loadAnimation(this@MainActivity,
                    R.anim.anim_mix)

                v!!.startAnimation(anim_mix)
            }
        })
    }
}
