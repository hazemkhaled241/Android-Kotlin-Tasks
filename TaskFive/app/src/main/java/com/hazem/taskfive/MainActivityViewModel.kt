package com.hazem.taskfive

import android.provider.ContactsContract
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel(){

    private val messagesLiveData:MutableLiveData<MutableList<String>> = MutableLiveData()
private fun returnMessages():MutableList<String>{
    val messages= mutableListOf<String>()
    return messages

}

}