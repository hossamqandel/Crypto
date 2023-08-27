package dev.hossam.model

data class CryptoDetail(
    val id: String,
    val description: String,
    val name: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<Team>,
    val is_active: Boolean,
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
