package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailChara : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var imgPhoto: ImageView
    private lateinit var tvAnime: TextView
    private lateinit var tvDetail: TextView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_ANIME = "extra_anime"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_chara)

        supportActionBar?.title = "Detail Character"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tvName = findViewById(R.id.tv_item_name)
        imgPhoto = findViewById(R.id.img_item_photo)
        tvAnime = findViewById(R.id.tv_anime)
        tvDetail = findViewById(R.id.tv_item_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val photo = intent.getIntExtra(EXTRA_IMAGE, 0)
        val anime = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvName.text = name
        imgPhoto.setImageResource(photo)
        tvAnime.text = anime
        tvDetail.text = detail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true
    }
}