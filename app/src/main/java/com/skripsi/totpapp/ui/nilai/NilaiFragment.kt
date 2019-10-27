package com.skripsi.totpapp.ui.nilai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.skripsi.totpapp.R

class NilaiFragment : Fragment() {

    private lateinit var nilaiViewModel: NilaiViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        nilaiViewModel =
            ViewModelProviders.of(this).get(NilaiViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_nilai, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        nilaiViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}