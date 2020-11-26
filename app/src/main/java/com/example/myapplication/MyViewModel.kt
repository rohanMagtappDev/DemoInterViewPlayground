package com.example.myapplication


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var abc:MutableLiveData<String> = MutableLiveData()
}