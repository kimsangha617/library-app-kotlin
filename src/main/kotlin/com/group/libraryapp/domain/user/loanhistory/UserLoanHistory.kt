package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.User
import javax.persistence.*

@Entity
class UserLoanHistory (

    @ManyToOne
    val user: User,

    val bookName: String,

    var status: UserLoanStatus = UserLoanStatus.LOANED,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
){
    fun doReturn() {
        this.status = UserLoanStatus.RETURNED
    }

    companion object {
        fun fixture(
            id: Long? = null,
            user: User,
            bookName: String = "죄와벌",
            status: UserLoanStatus = UserLoanStatus.LOANED
        ): UserLoanHistory {
            return UserLoanHistory(
                id = id,
                user = user,
                bookName = bookName,
                status = status,
            )
        }
    }
}