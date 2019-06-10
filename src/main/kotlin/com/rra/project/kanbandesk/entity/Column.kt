package com.rra.project.kanbandesk.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document
class Column {

    var title: String? = null

    var cards: List<Card>? = null

}
