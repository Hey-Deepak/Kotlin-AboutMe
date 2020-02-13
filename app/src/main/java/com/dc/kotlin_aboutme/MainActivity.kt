package com.dc.kotlin_aboutme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickname(it)
        }
    }
private fun addNickname(view: View){
    val editText = findViewById<EditText>(R.id.nick_name_edit_text)
    val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

    nicknameTextView.text = editText.text
    editText.visibility = View.GONE
    view.visibility = View.GONE
    nicknameTextView.visibility = View.GONE
}
}
