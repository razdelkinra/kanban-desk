package com.rra.project.kanbandesk.entity.address

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Address {

    var countryId: Long? = null

    var regionId: Long? = null

    var cityId: Long? = null

    var street: String? = null

    var building: String? = null

}

