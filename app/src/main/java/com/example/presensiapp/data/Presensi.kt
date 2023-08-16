package com.example.presensiapp.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "presensi_table")
data class Presensi (

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val tgl : String,
    val jam : String,
    val status : String
) : Parcelable