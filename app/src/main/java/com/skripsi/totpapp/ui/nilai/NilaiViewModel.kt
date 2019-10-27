package com.skripsi.totpapp.ui.nilai

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NilaiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Nilai Fragment"
    }
    val text: LiveData<String> = _text
}