package ptit.hau.readnewspaperwithrss

import android.app.Activity
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.URL
import java.nio.Buffer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ReadRSS(this).execute("https://vnexpress.net/rss/tin-moi-nhat.rss")
    }

    class ReadRSS(context: Activity) : AsyncTask<String, Void, String>() {
        val contextParent = context

        override fun doInBackground(vararg params: String?): String {
            val url = URL(params[0])
            val content = StringBuffer()

            val inputStreamReader = InputStreamReader(url.openConnection().getInputStream())

            val bufferedReader = BufferedReader(inputStreamReader)
            var line = bufferedReader.readLine()
            content.append(line)
            while (line!=null) {
                content.append(line)
                line = bufferedReader.readLine()
            }
            bufferedReader.close()

            return content.toString()
        }

        override fun onPostExecute(result: String) {
            super.onPostExecute(result)

            var parser = XMLDOMParser()
            var document = parser.getDocument(result)
            var nodeList = document!!.getElementsByTagName("item")

            var title = ""

            for (i in 0..(nodeList.length-1)) {
                var element = nodeList.item(i) as Element
                title = parser.getValue(element, "title") + "\n"
            }

            Toast.makeText(contextParent,result, Toast.LENGTH_LONG).show()
        }
    }
}
