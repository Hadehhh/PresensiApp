package com.example.presensiapp.data

import androidx.lifecycle.LiveData

class PresensiRepository(private val presensiDao: PresensiDao) {
    val readALlData : LiveData<List<Presensi>> = presensiDao.readAllData()

    fun addPresensi(presensi:Presensi){
        presensiDao.addPresensi(presensi)
    }
}