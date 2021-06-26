package ptit.hau.activitylifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnSecond.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })

        Log.d("test","onCreateSecond")
    }

    override fun onStart() {
        super.onStart()
        Log.d("test","onStartSecond")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","onResumeSecond")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test","onPauseSecond")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test","onStopSecond")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test","onDestroySecond")
    }
}
