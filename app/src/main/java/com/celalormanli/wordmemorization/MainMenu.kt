package com.celalormanli.wordmemorization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.main_background))
        var btnLearn:Button=findViewById(R.id.btnLearn)
        var btnExercises:Button=findViewById(R.id.btnExercises)
        var btnLearnedWords:Button=findViewById(R.id.btnLearnedWords)
        var btnSettings:Button=findViewById(R.id.btnSettings)
        var btnAbout:Button=findViewById(R.id.btnAbout)
        btnLearn.setOnClickListener {
            val intent = Intent(baseContext, LearnWord::class.java)
            startActivity(intent)
        }
        btnExercises.setOnClickListener {
            val intent = Intent(baseContext, Exercises::class.java)
            startActivity(intent)
        }
    }
}
