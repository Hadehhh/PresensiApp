package com.example.presensiapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Presensi::class], version = 1, exportSchema = false)
abstract class PresensiDatabase : RoomDatabase() {
    abstract fun presensiDao(): PresensiDao

    companion object {
        private var INSTANCE: PresensiDatabase? = null

        fun getDatabase(context: Context): PresensiDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PresensiDatabase::class.java,
                    "presensi_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}