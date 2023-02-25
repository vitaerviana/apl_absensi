package com.example.apl_absensi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class siswarpl(
    val namasiswa : String,
    val nis : String,
    val keterangan : String,
):Parcelable
