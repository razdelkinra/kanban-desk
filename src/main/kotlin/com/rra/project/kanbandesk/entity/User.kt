package com.rra.project.kanbandesk.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class User {

    @Id
    var userId: String? = null

    var name: String? = null

    var login: String? = null

    var age: Int? = null

    var company: Company? = null

}