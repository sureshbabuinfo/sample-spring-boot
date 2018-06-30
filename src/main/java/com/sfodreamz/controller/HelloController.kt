package com.sfodreamz.controller

import com.sfodreamz.dao.User
import com.sfodreamz.service.UserService
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