package com.example.myapplication.model

import retrofit2.Response
import retrofit2.http.GET

interface NoteApi {
    @GET("api/collections/notes/records")
    suspend fun getNote():Response<NotesResponse>
}