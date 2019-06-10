package com.rra.project.kanbandesk.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Board {

    @Id
    var boardId: String? = null

    var colunm: List<Column>? = null
}
