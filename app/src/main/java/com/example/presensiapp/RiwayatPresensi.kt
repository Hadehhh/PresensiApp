package com.example.presensiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.presensiapp.data.Presensi
import com.example.presensiapp.data.PresensiViewModel

class RiwayatPresensi : AppCompatActivity() {
    private lateinit var  mPresensiViewModel: PresensiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_presensi)

        val adapter = PresensiListAdapter()
        val recyclerView = findViewById<RecyclerView>(R.id.tv_recyle)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        mPresensiViewModel = ViewModelProvider(this).get(PresensiViewModel::class.java)
        val observer = Observer<List<Presensi>> { presensi ->
            adapter.setData(presensi)
        }
        mPresensiViewModel.readAllData.observeForever(observer)
    }
}