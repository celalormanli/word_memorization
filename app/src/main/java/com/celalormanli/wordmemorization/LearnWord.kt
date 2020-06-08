package com.celalormanli.wordmemorization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LearnWord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_word)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.main_background))
    }
}
