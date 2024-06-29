package com.ibrahim.bigdata.models

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val image: String,
    val role: String,
    val status: String,
    val created_at: String,
    val updated_at: String,
    val deleted_at: String
)
