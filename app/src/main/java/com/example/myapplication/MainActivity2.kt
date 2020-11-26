package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider

class MainActivity2 : AppCompatActivity() {
    private lateinit var mainViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mainViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        mainViewModel.abc.observe(this, {
            Log.e("Hiii", "onCreate: $it")
        })
    }

    fun moveTOAc2(view: View) {
        startActivity(Intent(this,MainActivity3::class.java))
    }
}