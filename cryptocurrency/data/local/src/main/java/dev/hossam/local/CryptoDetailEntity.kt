package dev.hossam.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CryptoDetailEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val description: String,
    val cryptoName: String,
    val symbol: String,
    val isActive: Boolean,
    val teamMembers: List<TeamMember>,
    val tags: List<Tag>,
)

data class TeamMember(
    val id: String,
    val name: String,
    val position: String,
)

data class Tag(
    val id: String,
    val name: String,
)
