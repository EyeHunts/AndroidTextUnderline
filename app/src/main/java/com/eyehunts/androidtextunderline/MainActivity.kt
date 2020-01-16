package com.eyehunts.androidtextunderline

import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView2.setPaintFlags(textView1.getPaintFlags() or Paint.UNDERLINE_TEXT_FLAG)
    }
}
