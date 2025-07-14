package com.rodrimu.api3mtesting

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ProductService {
    @GET("b/MX0A")
    suspend fun getProducts(): ProductResponse

    companion object {
        fun create(): ProductService {
            return Retrofit.Builder()
                .baseUrl("https://www.jsonkeeper.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ProductService::class.java)
        }
    }
}
