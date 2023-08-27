package dev.hossam.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CryptoDetailDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCryptoDetail(cryptoDetailEntity: CryptoDetailEntity)

    @Query("SELECT * FROM CryptoDetailEntity WHERE id = :id")
    suspend fun getCryptoDetailById(id: String): CryptoDetailEntity?
}