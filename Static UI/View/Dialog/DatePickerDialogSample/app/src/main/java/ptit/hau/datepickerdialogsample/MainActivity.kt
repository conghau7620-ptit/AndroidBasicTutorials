package ptit.hau.datepickerdialogsample

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDate.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                pickDate()
            }
        })
    }

    fun pickDate() {
        val today = Calendar.getInstance()
        val day1 = today.get(Calendar.DATE)
        val month1 = today.get(Calendar.MONTH)
        val year1 = today.get(Calendar.YEAR)
        var datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                view, year, month, day ->
                    today.set(year,month,day)
                    val dateFormat = SimpleDateFormat("dd/MM/yyyy")
                    tvDate.setText(dateFormat.format(today.time))
        },year1,month1,day1)
        datePickerDialog.show()
    }
}
