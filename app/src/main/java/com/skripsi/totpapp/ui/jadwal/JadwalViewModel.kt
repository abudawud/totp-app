package com.skripsi.totpapp.ui.jadwal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JadwalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Jadwal Fragment"
    }
    val text: LiveData<String> = _text
}