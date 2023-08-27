package dev.hossam.local.mapper

import dev.hossam.local.CryptoCurrencyEntity
import dev.hossam.local.dto.CryptoCurrencyDTO
import dev.hossam.model.Cryptocurrency

internal fun Cryptocurrency.toCryptocurrencyEntity(): CryptoCurrencyEntity {
    return CryptoCurrencyEntity(id,
        cryptoName = this.name,
        symbol,
        isActive
    )
}

internal fun CryptoCurrencyEntity.toCryptocurrencyDTO(): CryptoCurrencyDTO {
    return CryptoCurrencyDTO(
        id = id,
        cryptoName = cryptoName,
        symbol = symbol,
        isActive = isActive
    )
}

internal fun List<Cryptocurrency>.toCryptocurrenciesDTO(): List<CryptoCurrencyDTO> {
    return map { cryptocurrencyItem ->
        cryptocurrencyItem.toCryptocurrencyEntity().toCryptocurrencyDTO()
    }
}