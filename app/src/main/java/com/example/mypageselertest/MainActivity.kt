package com.example.mypageselertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MypageSelerTest", "Main onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onStart() {
        Log.i("MypageSelerTest", "Main onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("MypageSelerTest", "Main onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("MypageSelerTest", "Main onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("MypageSelerTest", "Main onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("MypageSelerTest", "Main onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("MypageSelerTest", "Main onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this@MainActivity, SubActivity::class.java)
        val intent2 = Intent(this@MainActivity, SubActivity2::class.java)
        startActivity(intent)
    }

    val bt_sell05 : Button = findViewById(R.id.b_sell01)

   /* btnStart.setOnClickListener {
        val intent = Intent(this,activity_sub::class.java)
        startActivity(intent)
    } */
}