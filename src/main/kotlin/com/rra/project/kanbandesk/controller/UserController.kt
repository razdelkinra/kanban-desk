package com.rra.project.kanbandesk.controller

import com.rra.project.kanbandesk.entity.User
import com.rra.project.kanbandesk.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class UserController(private val userRepository: UserRepository) {

    @GetMapping(path = ["user"])
    fun userList(): List<User> {
        userRepository.save(User().also { user -> user.age = 20; user.name = "Ruslan" })
        return userRepository.findAll()
    }

}