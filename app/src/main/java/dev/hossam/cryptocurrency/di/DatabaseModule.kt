package dev.hossam.cryptocurrency.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.hossam.data.room.CryptocurrencyDatabase
import dev.hossam.local.CryptoCurrenciesDao
import dev.hossam.local.CryptoDetailDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideLocalDatabase(@ApplicationContext context: Context): CryptocurrencyDatabase {
        return Room.databaseBuilder(
            context,
            CryptocurrencyDatabase::class.java,
            CryptocurrencyDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideCryptoCurrenciesDao(cryptocurrencyDatabase: CryptocurrencyDatabase): CryptoCurrenciesDao {
        return cryptocurrencyDatabase.cryptoCurrenciesDao()
    }

    @Provides
    @Singleton
    fun provideCryptoDetailDao(cryptocurrencyDatabase: CryptocurrencyDatabase): CryptoDetailDao {
        return cryptocurrencyDatabase.cryptoDetailDao()
    }

}