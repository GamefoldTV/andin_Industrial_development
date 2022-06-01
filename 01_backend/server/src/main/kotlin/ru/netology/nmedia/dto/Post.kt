package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val authorAvatar : String,
    val published: String,
    val content: String,
    val likedByMe: Boolean,
    val likedCount: Int = 0,
    val sharedCount : Int,
    val viewedCount : Int,
    val videoURL : String
)
