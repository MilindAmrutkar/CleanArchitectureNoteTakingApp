package com.backtocoding.core.data

data class Note(
    val title: String,
    val content: String,
    val creationTime: Long,
    var updateTime: Long,
    var id: Long = 0
)