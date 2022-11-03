package com.example.bukota

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailCity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_INFORMATION = "extra_information"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_city)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail Kota"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_item_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvInfo: TextView = findViewById(R.id.information)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tInfo = intent.getStringExtra(EXTRA_INFORMATION)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvInfo.text = tInfo
        tvDetail.text = tDetail

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener{
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "Ayo Lihat Aplikasi Saya!")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share ke: "))
        }



    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}