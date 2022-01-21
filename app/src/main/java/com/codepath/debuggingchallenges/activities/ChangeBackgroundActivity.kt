package com.codepath.debuggingchallenges.activities

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.codepath.debuggingchallenges.R

class ChangeBackgroundActivity : AppCompatActivity() {
    private var oldColor = Color.BLUE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_background)
    }

     fun onGoClick(view: View?) {
        val mainView = findViewById<View>(android.R.id.content)//btnGo)
        mainView.setBackgroundColor(nextColor)
        Toast.makeText(this,"Go Clicked", Toast.LENGTH_LONG).show()
        Log.d("D","error here?")

    }


    private val nextColor: Int
        private get() {
            val newColor = if (oldColor == Color.BLUE) Color.RED else Color.BLUE
            oldColor = newColor
            return newColor
        }
}