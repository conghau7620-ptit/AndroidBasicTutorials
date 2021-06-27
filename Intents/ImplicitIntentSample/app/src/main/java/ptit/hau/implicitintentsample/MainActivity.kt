package ptit.hau.implicitintentsample

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val REQUEST_CODE_CALL = 11
    val REQUEST_CODE_CAMERA = 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChrome.setOnClickListener(this)
        btnMessage.setOnClickListener(this)
        btnCall.setOnClickListener(this)
        btnCamera.setOnClickListener(this)

        if (ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.CALL_PHONE) !=
            PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                REQUEST_CODE_CALL)
        }
        if (ContextCompat.checkSelfPermission(this,
                android.Manifest.permission.CAMERA) !=
            PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.CAMERA),
                REQUEST_CODE_CAMERA)
        }

    }

    override fun onClick(v: View?) {
        val intent = Intent()
        when (v!!.id) {
            R.id.btnChrome -> {
                intent.setAction(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://github.com/conghau7620-ptit"))
                startActivity(intent)
            }
            R.id.btnMessage -> {
                intent.setAction(Intent.ACTION_SENDTO)
                intent.putExtra("sms_body", "Hi baby!")
                intent.setData(Uri.parse("sms:0123456789"))
                startActivity(intent)
            }
            R.id.btnCall -> {
                intent.setAction(Intent.ACTION_CALL)
                intent.setData(Uri.parse("tel:0123456789"))
                startActivity(intent)
            }
            R.id.btnCamera -> {
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intent)
            }
        }
    }
}
