package com.group.libraryapp.dto.book

import com.group.libraryapp.type.BookType

data class BookRequest(
    val name: String,
    val type: BookType,
)
