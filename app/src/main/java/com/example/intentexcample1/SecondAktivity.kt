package com.example.intentexcample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class SecondAktivity : AppCompatActivity() {

    val Log = Logger.getLogger(SecondAktivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_aktivity)

        Log.info("onCreate")
        btnToSecondActivity.setOnClickListener{
            finish()
        }
    }
    override fun onStart(){
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop(){
        super.onStop()
        Log.info("onStop")
    }
}