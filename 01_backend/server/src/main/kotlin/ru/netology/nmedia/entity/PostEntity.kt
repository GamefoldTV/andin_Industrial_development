package ru.netology.nmedia.entity

import ru.netology.nmedia.dto.Post
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class PostEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var author: String,
    var authorAvatar: String,
    var published: String,
    var content: String,
    var likedByMe: Boolean,
    var likedCount: Int = 0,
    var sharedCount: Int,
    var viewedCount: Int,
    var videoURL: String,
) {
    fun toDto() = Post(
        id,
        author,
        authorAvatar,
        published,
        content,
        likedByMe,
        likedCount,
        sharedCount,
        viewedCount,
        videoURL
    )

    companion object {
        fun fromDto(dto: Post) = PostEntity(
            dto.id,
            dto.author,
            dto.authorAvatar,
            dto.published,
            dto.content,
            dto.likedByMe,
            dto.likedCount,
            dto.sharedCount,
            dto.viewedCount,
            dto.videoURL
        )
    }
}