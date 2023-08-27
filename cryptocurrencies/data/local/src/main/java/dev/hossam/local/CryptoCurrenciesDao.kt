package dev.hossam.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CryptoCurrenciesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCryptocurrencies(cryptoCurrencies: List<CryptoCurrencyEntity>)
    @Query("DELETE FROM CryptoCurrencyEntity")
    suspend fun deleteAllCryptocurrencies()
    @Query("SELECT * FROM CryptoCurrencyEntity")
    fun getAllCryptocurrencies(): Flow<List<CryptoCurrencyEntity>>

}