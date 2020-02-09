package com.rra.project.kanbandesk.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.rra.project.kanbandesk.entity.Column
import com.rra.project.kanbandesk.repository.ColumnRepository
import org.springframework.stereotype.Component

@Component
class ColumnQueryResolver(private val columnRepository: ColumnRepository) : GraphQLQueryResolver {

    fun columns(): List<Column> {
        return columnRepository.findAll()
    }

}