package dev.hossam.local.dto

import dev.hossam.local.Tag
import dev.hossam.local.TeamMember

data class CryptoDetailDTO(
    val id: String,
    val description: String,
    val cryptoName: String,
    val symbol: String,
    val isActive: Boolean,
    val tags: List<Tag>,
    val teamMembers: List<TeamMember>,
)
