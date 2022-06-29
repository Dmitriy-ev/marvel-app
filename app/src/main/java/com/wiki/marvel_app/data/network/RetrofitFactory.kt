package com.wiki.marvel_app.data.network

import com.wiki.marvel_app.util.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    companion object {
        val instance = RetrofitFactory()
    }

    private fun okHttpInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    private val okHttpClient = OkHttpClient.Builder() // паттерн строитель
        .addInterceptor(okHttpInterceptor())
        .build()

    private val retrofitClient: Retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val charactersService: MarvelApi = retrofitClient.create(MarvelApi::class.java)
}