package com.celalormanli.wordmemorization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.r0adkll.slidr.Slidr

class Exercises : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.main_background))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        Slidr.attach(this)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}
