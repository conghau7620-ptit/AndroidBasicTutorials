package ptit.hau.sharedpreferencessample

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val ACCOUNT = "conghau"
    val PASS = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreference = getSharedPreferences("dataLogin", MODE_PRIVATE)
        val acc = sharedPreference.getString("acc","")
        val pass = sharedPreference.getString("pass","")
        val isSave = sharedPreference.getBoolean("isSave",false)

        edtAcc.setText(acc)
        edtPass.setText(pass)
        cbSave.isChecked = isSave

        btnLogIn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (edtAcc.text.toString().equals(ACCOUNT) &&
                    edtPass.text.toString().equals(PASS)) {
                        val editor = sharedPreference.edit()
                        if (cbSave.isChecked) {
                            editor.putString("acc",edtAcc.text.toString())
                            editor.putString("pass",edtPass.text.toString())
                            editor.putBoolean("isSave",true)
                            editor.apply()
                        }
                        else {
                            editor.remove("acc")
                            editor.remove("pass")
                            editor.remove("isSave")
                            editor.apply()
                        }

                        val intent = Intent(this@MainActivity,SecondActivity::class.java).apply {
                            putExtra("name","Cong Hau")
                        }
                        startActivity(intent)
                        finish()
                }
                else {
                    Toast.makeText(this@MainActivity,"Accound or password is not correct",Toast.LENGTH_LONG).show()
                }


            }
        })
    }


}
