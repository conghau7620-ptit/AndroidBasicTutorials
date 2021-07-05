package ptit.hau.loadimagefrominternet

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLoad.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                LoadImage(this@MainActivity).execute("https://znews-photo.zadn.vn/w660/Uploaded/qfssu/2021_06_01/iu_dep_het_phan_thien_ha_1.jpg")
            }
        })
    }

    class LoadImage(context : Activity) : AsyncTask<String,Void,Bitmap>() {
        var imgView = context.findViewById<ImageView>(R.id.imgView)

        override fun doInBackground(vararg params: String?): Bitmap {
            var url = URL(params[0])

            var inputStream = url.openConnection().getInputStream()

            val bitmap = BitmapFactory.decodeStream(inputStream)

            return bitmap!!
        }

        override fun onPostExecute(result: Bitmap?) {
            super.onPostExecute(result)
            imgView.setImageBitmap(result)
        }
    }
}
