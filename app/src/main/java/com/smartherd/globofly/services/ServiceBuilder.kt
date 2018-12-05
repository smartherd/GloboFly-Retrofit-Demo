package com.smartherd.globofly.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    // Before release, change this URL to your live server URL such as "https://smartherd.com/"
    private const val URL = "http://10.0.2.2:9000/"

    // Create OkHttp Client
    private val okHttp = OkHttpClient.Builder()

    // Create Retrofit Builder
    private val builder = Retrofit.Builder().baseUrl(URL)
                                        .addConverterFactory(GsonConverterFactory.create())
                                        .client(okHttp.build())

    // Create Retrofit Instance
    private val retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }
}