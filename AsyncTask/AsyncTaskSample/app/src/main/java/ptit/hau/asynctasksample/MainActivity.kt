package ptit.hau.asynctasksample

import android.app.Activity
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Work(this@MainActivity).execute()
            }
        })

    }

    class Work(context: Activity) : AsyncTask<Void,String,String>() {
        var textView: TextView? = null
        var btnStart: Button? = null

        init {
            context
            textView = context.findViewById(R.id.textView)
            btnStart = context.findViewById(R.id.btnStart)
        }

        override fun onPreExecute() {
            super.onPreExecute()
            textView!!.text = "Start now.\n"
        }

        override fun doInBackground(vararg params: Void?): String {
            for (i in 1..5) {
                Thread.sleep(1000)
                publishProgress("Finish activity $i \n")
            }
            return "Finish all."
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            textView!!.append(result)
        }

        override fun onProgressUpdate(vararg values: String?) {
            super.onProgressUpdate(*values)
            textView!!.append(values[0])
        }
    }
}
