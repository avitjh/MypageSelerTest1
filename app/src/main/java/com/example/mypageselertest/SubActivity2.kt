package com.example.mypageselertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SubActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MypageSelerTest","sub2 onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)
    }

    public override fun onStart() {
        Log.i("MypageSelerTest", "Sub2 onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("MypageSelerTest", "Sub2 onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("MypageSelerTest", "Sub2 onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("MypageSelerTest", "Sub2 onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("MypageSelerTest", "Sub2 onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("MypageSelerTest", "Sub2 onDestroy() called.")
        super.onDestroy()
    }
   fun onButtonClick(view: View) {
       val intent = Intent(this@SubActivity2, SubActivity3::class.java)
       startActivity(intent)
   }
}