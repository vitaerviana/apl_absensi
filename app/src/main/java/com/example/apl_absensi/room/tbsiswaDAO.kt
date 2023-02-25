package com.example.apl_absensi.room

import androidx.room.*


@Dao
interface tbsiswaDao {

    @Insert
    fun addtbsiswa(tbsis:tbsiswa)

    @Update
    fun updatetbsiswa(tbsis:tbsiswa)

    @Delete
    fun deltbsiswa(tbsis:tbsiswa)

    @Query("SELECT * FROM tbsiswa")
    fun tampilsemua():List<tbsiswa>

    @Query("SELECT * FROM  tbsiswa WHERE nis=:tbsis_nis")
    suspend fun tampil(tbsis_nis:Int):List<tbsiswa>


}
