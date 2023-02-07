package io.yeletskyiv.androidtvyoutubeproblemsample

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.youtube_btn)
        val text = findViewById<EditText>(R.id.link_text)

        button.setOnClickListener { showVideo(text.text.toString()) }
    }

    private fun showVideo(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        this.startActivity(intent)
    }
}