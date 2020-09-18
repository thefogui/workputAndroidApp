package com.thefogui.workout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.thefogui.workout.view.join.JoinActivity
import com.thefogui.workout.view.login.LoginActivity
import java.lang.Exception


class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startVideoBackground()
        setOnClickListenerBtnJoin()
        setOnClickListenerBtnLogin()
    }

    private fun startVideoBackground() {
        val videoView = findViewById<VideoView>(R.id.videoView)
        val uri: Uri = Uri.parse("android.resource://$packageName/${R.raw.bg}")
        videoView.setVideoURI(uri)
        videoView.start()

        setVideoBackgroundLoopToTrue(videoView)
    }

    private fun setVideoBackgroundLoopToTrue(videoView : VideoView) {
        videoView.requestFocus()
        videoView.setOnPreparedListener {
            mp -> mp.isLooping = true
        }
    }

    private fun setOnClickListenerBtnJoin() {
        val buttonJoin : Button = findViewById<Button>(R.id.btnJoin)

        buttonJoin.setOnClickListener() {
            try {
                val intent = Intent(this, JoinActivity::class.java)
                startActivity(intent)
            } catch (e : Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun setOnClickListenerBtnLogin() {
        val buttonLogin : Button = findViewById<Button>(R.id.btnLogin)

        buttonLogin.setOnClickListener() {
            try {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } catch (e : Exception) {
                e.printStackTrace()
            }
        }
    }


}