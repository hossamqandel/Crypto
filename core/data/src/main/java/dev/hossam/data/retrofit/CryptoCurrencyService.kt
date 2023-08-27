package dev.hossam.data.retrofit

import dev.hossam.constant.EndPoints
import dev.hossam.model.CryptoDetail
import dev.hossam.model.Cryptocurrency
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoCurrencyService {

    @GET(EndPoints.GET_ALL_CRYPTOCURRENCIES)
    suspend fun getAllCryptocurrencies(): List<Cryptocurrency>

    @GET(EndPoints.GET_CRYPTO_DETAILS)
    suspend fun getCryptocurrencyById(
        @Path("coinId") coinId: String
    ): CryptoDetail
}