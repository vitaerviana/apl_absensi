package com.example.apl_absensi.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class tbsiswa (
    val nama : String,
    @PrimaryKey
    val nis : Int
    )