package com.dc.kotlin_aboutme

import android.content.Context
import android.databinding.DataBindingComponent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.dc.kotlin_aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       // findViewById<Button>(R.id.done_button).setOnClickListener {
         //   addNickname(it)
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nick_name_edit_text)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        binding.nicknameText.text = binding.nickNameEditText.text
        binding.nameText.visibility = View.GONE
        binding.doneButton.visibility = View.GONE
        binding.nickNameEditText.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
