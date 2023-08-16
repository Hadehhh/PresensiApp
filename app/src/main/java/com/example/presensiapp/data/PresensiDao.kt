package com.example.presensiapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PresensiDao {
    @Insert(onConflict  = OnConflictStrategy.IGNORE)
    fun addPresensi(presensi: Presensi)

    @Query("SELECT * FROM presensi_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Presensi>>
}