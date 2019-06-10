package com.rra.project.kanbandesk.entity.address

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Region {

    @Id
    var regionId: Long? = null

    var name: String? = null

}
