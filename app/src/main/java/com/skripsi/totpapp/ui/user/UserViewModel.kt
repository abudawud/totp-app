package com.skripsi.totpapp.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val userName = MutableLiveData<String>().apply {
        value = "This is user Fragment"
    }

    fun getUserName():MutableLiveData<String>{
        return userName
    }
}