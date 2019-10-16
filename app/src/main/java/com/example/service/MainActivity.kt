package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_facebook.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.facebook.com/bayu adi pratama"))
            startActivity(i)
        }
        btn_instagram.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse
                ("https://www.instagram.com/bayu_kjm04/?hl=id"))
            startActivity(i)
        }

        //mendeklarasikan variable MediaPlayer dan memanggil data mp3
        val MediaPlayer: MediaPlayer? = android.media.MediaPlayer.create(this, R.raw.sob)
        //button yang berfungsi untuk melakukakan pause mp3
        btn_Play.setOnClickListener{
            MediaPlayer?.start()
        }
        //button yang berfungsi untuk melakukakan pause
        btn_Pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        btn_Stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
