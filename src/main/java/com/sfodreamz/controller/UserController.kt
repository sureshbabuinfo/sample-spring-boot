package com.sfodreamz.controller

import com.sfodreamz.dao.User
import com.sfodreamz.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class UserController {

    @Autowired
    private lateinit var userService:UserService

    @RequestMapping("/reg")
    fun welcome(): String {
        return "redirect:/test1.html"
    }

    @RequestMapping(value = "/user/create", method = arrayOf(RequestMethod.POST))
    fun createUser(@ModelAttribute("user") user: User): String {
        userService.create(user)
        return "registration"
    }
}