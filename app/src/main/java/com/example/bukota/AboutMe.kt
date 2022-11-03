package com.example.bukota

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AboutMe : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        val actionBar = supportActionBar
        actionBar!!.title = "About Me"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val btnAboutMe: Button = findViewById(R.id.my_socmed)
        btnAboutMe.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.my_socmed -> {
                val myAccount = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/arda-ardiansyah-9253a71b4/"))
                startActivity(myAccount)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}