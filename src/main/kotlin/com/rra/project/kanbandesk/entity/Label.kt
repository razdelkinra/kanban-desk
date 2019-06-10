package com.rra.project.kanbandesk.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Label {

    var name: String? = null
}