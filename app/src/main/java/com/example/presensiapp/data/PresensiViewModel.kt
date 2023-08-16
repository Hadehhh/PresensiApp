package com.example.presensiapp.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PresensiViewModel(application: Application): AndroidViewModel(application) {
    val readAllData : LiveData<List<Presensi>>
    private val repository : PresensiRepository

    init {
        val presensiDao = PresensiDatabase.getDatabase(application).presensiDao()
        repository = PresensiRepository(presensiDao)
        readAllData = repository.readALlData
    }

    fun addPresensi(presensi : Presensi){
        viewModelScope.launch(Dispatchers.IO){
            repository.addPresensi(presensi)
        }
    }
}