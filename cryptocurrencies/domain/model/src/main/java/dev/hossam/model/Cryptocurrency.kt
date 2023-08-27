package dev.hossam.model

data class Cryptocurrency(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val symbol: String,
    val type: String
)