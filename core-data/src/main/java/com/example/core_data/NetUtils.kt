package com.example.core_data

import okhttp3.OkHttpClient

const val BASE_URL = "https://bestsecret-recruitment-api.herokuapp.com/"
const val AUTHORIZATION = "ddf49ca9-44cf-4613-b218-ddc030bbfa63"

val client = OkHttpClient.Builder().addInterceptor {
    val newRequest = it.request().newBuilder()
        .addHeader("Authorization", AUTHORIZATION)
        .build()
    it.proceed(newRequest)
}.build()
