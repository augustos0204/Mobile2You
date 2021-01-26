package com.example.mobile2you.http

import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.json.JSONArray

class HttpHelper {

    class GetTopFilm {
        val client = OkHttpClient()
        val URL = "https://api.themoviedb.org/3/movie/top_rated?api_key=8a158f4f4c989466d64de296e1d3448a&language=pt-BR&page=1"
        val request = Request.Builder()
            .url(URL)
            .get()
            .build()
        val response = client.newCall(request).execute()
        val responseBody = response.body()
        val responseJson = responseBody!!.string()
        val responseArray = JSONArray(responseJson)
    }

}