package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User

data class UserResponse(
    val id: Long,
    val name: String,
    val age: Int?,
) {
    companion object {
        fun of(user: User): UserResponse {
           return UserResponse(
            id = user.id!!, //kotlin에서 !!는 널이 아님을 선언해주는것
            name = user.name,
            age = user.age,
           )
        }
    }

}