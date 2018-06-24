package com.formsdirectinc.applicationcenter.service

import com.formsdirectinc.applicationcenter.dao.User
import com.formsdirectinc.applicationcenter.dao.UserDAO
import org.springframework.transaction.annotation.Propagation
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

@Service
open class UserService {

    @Resource
    private val userDao: UserDAO? = null

    @Transactional
    open fun create(a: User) {
        userDao!!.create(a)
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    open fun findByEmail(email: String): User {
        return userDao!!.findByEmail(email)
    }
}