package com.rra.project.kanbandesk.entity.address

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class City {

    @Id
    var cityId: Long? = null

    var name: String? = null

}
