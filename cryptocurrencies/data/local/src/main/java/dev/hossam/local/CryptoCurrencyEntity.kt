package dev.hossam.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CryptoCurrencyEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val cryptoName: String,
    val symbol: String,
    val isActive: Boolean
)
