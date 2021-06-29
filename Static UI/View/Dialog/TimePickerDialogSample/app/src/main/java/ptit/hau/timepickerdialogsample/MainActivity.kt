package ptit.hau.timepickerdialogsample

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTime.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                pickTime()
            }
        })
    }

    fun pickTime() {
        var time = Calendar.getInstance()
        var hour1 = time.get(Calendar.HOUR_OF_DAY)
        var minute1 = time.get(Calendar.MINUTE)
        var timePickerDialog = TimePickerDialog(this,TimePickerDialog.OnTimeSetListener {
                view, hourOfDay, minute ->
                    time.set(hour1,minute)
                    val timeFormat = SimpleDateFormat("HH:mm:ss")
                    tvTime.setText(timeFormat.format(time.time))
        },hour1,minute1,true)

        timePickerDialog.show()
    }
}
