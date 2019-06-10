package com.rra.project.kanbandesk.controller

import com.rra.project.kanbandesk.entity.User
import com.rra.project.kanbandesk.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping
class UserController(private val userRepository: UserRepository) {

    @GetMapping(path = ["user"])
    fun userList(): Flux<User> {
        userRepository.save(User().also { user -> user.age = 20; user.name = "Ruslan" }).subscribe()
        return userRepository.findAll()
    }

}