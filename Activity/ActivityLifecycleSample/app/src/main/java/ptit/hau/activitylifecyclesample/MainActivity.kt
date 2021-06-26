package ptit.hau.activitylifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMain.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        })

        Log.d("test","onCreateMain")
    }

    override fun onStart() {
        super.onStart()
        Log.d("test","onStartMain")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","onResumeMain")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test","onPauseMain")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test","onStopMain")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test","onDestroyMain")
    }
}
