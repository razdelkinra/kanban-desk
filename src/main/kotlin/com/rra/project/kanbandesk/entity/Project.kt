package com.rra.project.kanbandesk.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Project {

    @Id
    var projectId: String? = null

    var projectName: String? = null

    var boards: List<Board>? = null

    var privacy: Privacy? = null
}