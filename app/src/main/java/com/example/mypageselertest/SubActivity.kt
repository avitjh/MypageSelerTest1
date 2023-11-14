package com.example.mypageselertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MypageSelerTest", "Sub onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    public override fun onStart() {
        Log.i("MypageSelerTest", "Sub onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("MypageSelerTest", "Sub onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("MypageSelerTest", "Sub onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("MypageSelerTest", "Sub onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("MypageSelerTest", "Sub onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("MypageSelerTest", "Sub onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
            val intent = Intent(this@SubActivity, SubActivity2::class.java)
            startActivity(intent)
    }

    val btnStart : Button = findViewById(R.id.b_sell01)

   /* btnStart.setOnClickListener {
        val intent = Intent(this,activity_sub::class.java)
        startActivity(intent)
    } */


}