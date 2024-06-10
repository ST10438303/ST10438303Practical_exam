import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.R

class MainActivity2 : AppCompatActivity() {

    enum class Days {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Set up the spinner options
        val daysSpinner = findViewById<Spinner>(R.id.daysSpinner)
        daysSpinner.adapter = ArrayAdapter<Days>(this,
            android.R.layout.simple_list_item_1, Days.values())

        // Get references to TextViews
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)

        // Get reference to the Show button
        val showButton = findViewById<Button>(R.id.showButton)

        // Set OnClickListener for the Show button
        showButton.setOnClickListener {
            // Get the selected day from the spinner
            val selectedDay = daysSpinner.selectedItem as Days

            // Display weather information based on the selected day
            when (selectedDay) {
                Days.Monday -> {
                    textView1.text = "Sunny"
                    textView2.text = "12"
                    textView3.text = "25"
                    // Calculate average between textView2 and textView3
                    val average = (textView2.text.toString().toInt() + textView3.text.toString().toInt()) / 2.0
                    textView4.text = average.toString()
                }
                else -> {
                    // For other days, you can set default values or handle them as needed
                    textView1.text = ""
                    textView2.text = ""
                    textView3.text = ""
                    textView4.text = ""
                }
            }
        }
    }
}