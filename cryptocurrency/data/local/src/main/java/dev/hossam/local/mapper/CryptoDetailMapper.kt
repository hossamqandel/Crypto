package dev.hossam.local.mapper

import dev.hossam.local.CryptoDetailEntity
import dev.hossam.local.Tag
import dev.hossam.local.TeamMember
import dev.hossam.local.dto.CryptoDetailDTO
import dev.hossam.model.CryptoDetail


internal fun CryptoDetail.toCryptoDetailEntity(): CryptoDetailEntity {
    return CryptoDetailEntity(
        id,
        description,
        name,
        symbol,
        isActive,
        team.map { TeamMember(it.id, it.name, it.position) },
        tags.map { Tag(it.id, it.name) }
    )

}

internal fun CryptoDetailEntity.toCryptoDetailDTO(): CryptoDetailDTO {
    return CryptoDetailDTO(
        id = id,
        description = description,
        cryptoName = cryptoName,
        symbol = symbol,
        isActive = isActive,
        tags = tags,
        teamMembers = teamMembers
    )
}

