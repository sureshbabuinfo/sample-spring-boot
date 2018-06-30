package com.formsdirectinc.applicationcenter.service

import com.formsdirectinc.applicationcenter.dao.User
import com.formsdirectinc.applicationcenter.dao.UserDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Propagation
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class UserService {

    @Autowired
    private lateinit var userDao: UserDAO

    @Transactional
    open fun create(user: User) {
        userDao.save(user)
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    open fun findByEmail(email: String): User? {
        return null
        //return userDao!!.findByEmail(email)
    }
}