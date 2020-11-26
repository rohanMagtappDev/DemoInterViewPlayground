package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        mainViewModel.abc.value = "wdfewdcedfc"

        mainViewModel.abc.observe(this,{
            Log.e("Hii",it)
        })
    }

    fun moveTOAc2(view: View) {
        startActivity(Intent(this,MainActivity2::class.java))
    }
}