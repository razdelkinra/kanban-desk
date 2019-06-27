package com.rra.project.kanbandesk.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.rra.project.kanbandesk.entity.Board
import com.rra.project.kanbandesk.repository.BoardRepository
import org.springframework.stereotype.Component

@Component
class BoardQueryResolver(private val boardRepository: BoardRepository) : GraphQLQueryResolver {

    fun boards(): List<Board> {
        return boardRepository.findAll()
    }

}