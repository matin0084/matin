package com.example.myapplication.model

data class NotesResponse(val items: List<Note>)


data class Note(val title: String, val content: String, val id: String)
