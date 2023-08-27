package dev.hossam.model

import com.google.gson.annotations.SerializedName

data class Cryptocurrency(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    val name: String,
    val symbol: String,
    val type: String
)