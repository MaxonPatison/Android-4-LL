package com.maxonpatison.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        var button = findViewById<Button>(R.id.Button)
        var editText = findViewById<EditText>(R.id.ET)
        var textView = findViewById<TextView>(R.id.TV)
        var imageView = findViewById<ImageView>(R.id.IV)
        var linearLayoutButton = findViewById<LinearLayout>(R.id.LLB)
        var linearLayoutTextView = findViewById<LinearLayout>(R.id.LLTV)

        button.setOnClickListener {
            linearLayoutButton.background = AppCompatResources.getDrawable(this, R.color.yellow)
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                Toast.makeText(this@MainActivity, "beforeTextChanged $s", Toast.LENGTH_SHORT).show()
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s?.equals("Samsung") == true){
                    textView.setText("")
                }
            }

            override fun afterTextChanged(s: Editable?) {
//                Toast.makeText(this@MainActivity, "afterTextChanged $s", Toast.LENGTH_SHORT).show()
            }
        })
}
    }

