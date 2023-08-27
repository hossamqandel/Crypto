package dev.hossam.data.room

import androidx.room.TypeConverter
import com.google.gson.Gson
import dev.hossam.local.Tag

class TagConverter {
    @TypeConverter
    fun toJson(tag: Tag): String = Gson().toJson(tag)
    fun fromJson(value: String): Tag = Gson().fromJson(value, Tag::class.java)
}