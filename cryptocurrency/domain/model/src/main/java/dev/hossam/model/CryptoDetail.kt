package dev.hossam.model

import com.google.gson.annotations.SerializedName

data class CryptoDetail(
    val id: String,
    val description: String,
    val name: String,
    val symbol: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    val tags: List<Tag>,
    val team: List<Team>,

)

data class Tag(
    val id: String,
    val name: String
)

data class Team(
    val id: String,
    val name: String,
    val position: String
)
