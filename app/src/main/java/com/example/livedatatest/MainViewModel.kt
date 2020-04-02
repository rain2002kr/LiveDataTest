package com.example.livedatatest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

    val liveData = MutableLiveData<Trigger>()
    val trigger = Trigger()

    fun trigger() {
        trigger.count++
        liveData.value =trigger
    }



}