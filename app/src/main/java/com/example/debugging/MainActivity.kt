package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // OLD       Log.d(TAG, "this is where the app crashed before")
        // OLD       val helloTextView: TextView = findViewById(R.id.division_textview)
        // OLD      Log.d(TAG, "this should be logged if the bug is fixed")
        // OLD      helloTextView.text = "Hello, debugging!"

        //bringing numerator and denominator out of the function
        val numerator = 60
        var denominator = 4

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)

        // Set a click listener on the button to run division when the user taps the button
        rollButton.setOnClickListener {
           // repeat(4) {
                Log.v(TAG, "The denominator is $denominator")
                findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
                //division(denominator)
              //Thread.sleep(2000)

                Log.v(TAG, "${numerator / denominator}")
                // Log.v(TAG, "The denominator is $denominator")
                denominator--
            //}
            }
        logging()
        //division()
    }


    }



/*
    fun division (denominator: Int) {
        //val numerator = 60
        //var denominator = 4
        var divisionTextView = findViewById<TextView>(R.id.division_textview)
        //repeat (4 ) {
 //           findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
            //findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
            //divisionTextView.setText("${numerator / denominator}")
            Log.d(TAG, divisionTextView.text as String)
            //Thread.sleep(1000)

//                       Log.d(TAG, "$denominator")
            Log.v(TAG, "${numerator / denominator}")
            //denominator--

        //}
    }

 */
    fun logging () {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }




