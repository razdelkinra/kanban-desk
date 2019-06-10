package com.rra.project.kanbandesk.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Company {

    @Id
    var companyId: Long? = null

    var name: String? = null

}
