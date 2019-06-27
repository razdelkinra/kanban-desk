package com.rra.project.kanbandesk.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.rra.project.kanbandesk.entity.Board
import com.rra.project.kanbandesk.repository.BoardRepository
import org.springframework.stereotype.Component

@Component
class BoardMutationResolver(private val boardRepository: BoardRepository) : GraphQLMutationResolver {

    fun addBoard(id: String): Board {
        return boardRepository.save(Board().also { board -> board.boardId = id })
    }

}