package com.example.oneandtwowaybinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {
    //MutableLiveData value is updated or change
    var factsLiveDataObject = MutableLiveData<String>("This is a fact")

    //LiveData value is not updated and change
//    val factsLiveData: LiveData<String>
//        get() = factsLiveDataObject

    fun updateLiveData(){
        factsLiveDataObject.value = "Another Facts"
    }
}