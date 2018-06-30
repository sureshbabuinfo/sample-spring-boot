package com.formsdirectinc.applicationcenter.controller

import com.formsdirectinc.applicationcenter.dao.User
import com.formsdirectinc.applicationcenter.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {

    @Autowired
    lateinit var userService:UserService

    @RequestMapping("/test")
    fun index(): String {

        userService.create(User().apply {
            name = "suresh"
            emailId = "suresh@dcis.net"
        })

        return "Greetings from Spring Boot!"
    }

}