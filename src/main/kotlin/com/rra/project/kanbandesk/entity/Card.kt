package com.rra.project.kanbandesk.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
class Card {

    var description: String? = null

    var name: String? = null

    var dutyDate: LocalDateTime? = null

    var responsible: User? = null

    var status: Status? = null

    var position: Int? = null

    var label: List<Label>? = null
}