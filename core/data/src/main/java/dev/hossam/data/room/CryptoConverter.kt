package dev.hossam.data.room

import androidx.room.TypeConverter
import com.google.gson.Gson
import dev.hossam.local.CryptoCurrencyEntity


class CryptoConverter {

    @TypeConverter
    fun listToJson(value: List<CryptoCurrencyEntity>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) =
        Gson().fromJson(value, Array<CryptoCurrencyEntity>::class.java)
            .toList()
}