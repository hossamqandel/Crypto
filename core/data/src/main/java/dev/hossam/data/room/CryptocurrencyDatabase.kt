package dev.hossam.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import dev.hossam.local.CryptoCurrenciesDao
import dev.hossam.local.CryptoCurrencyEntity
import dev.hossam.local.CryptoDetailDao

@Database(entities = [CryptoCurrencyEntity::class], exportSchema = false, version = 1)
@TypeConverters(CryptoConverter::class, TeamMemberConverter::class, TagConverter::class)
abstract class CryptocurrencyDatabase : RoomDatabase() {

    companion object { const val DATABASE_NAME = "Cryptocurrency_Database" }

    abstract fun cryptoCurrenciesDao(): CryptoCurrenciesDao
    abstract fun cryptoDetailDao(): CryptoDetailDao
}