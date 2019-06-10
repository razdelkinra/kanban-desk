package com.rra.project.kanbandesk.service

import com.rra.project.kanbandesk.entity.*
import com.rra.project.kanbandesk.repository.BoardRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class BoardService(private val boardRepository: BoardRepository) {

    fun createDefaultBoard() =
            Board().also { board ->
                board.colunm = listOf(
                        Column().also { column ->
                            column.title = "Todo"
                            column.cards = listOf(Card().also { card ->
                                card.description = "Default todo description"
                                card.dutyDate = LocalDateTime.now().plusDays(2)
                                card.label = listOf(Label().also { label -> label.name = "Legacy" })
                                card.status = Status.OPEN
                                card.responsible = User().also { user ->
                                    user.name = "System"
                                    user.age = 99
                                    user.login = "System"
                                    user.company = Company().also { company ->
                                        company.name = "Facebook"
                                    }
                                }

                            })
                        },
                        Column().also { column ->
                            column.title = "In progress"
                            column.cards = listOf(Card().also { card ->
                                card.description = "Default in progress description"
                                card.dutyDate = LocalDateTime.now().plusDays(2)
                                card.label = listOf(Label().also { label -> label.name = "Legacy" })
                                card.status = Status.CANCELED
                                card.responsible = User().also { user ->
                                    user.name = "System"
                                    user.age = 99
                                    user.login = "System"
                                    user.company = Company().also { company ->
                                        company.name = "Facebook"
                                    }
                                }

                            })
                        },
                        Column().also { column ->
                            column.title = "Done"
                            column.cards = listOf(Card().also { card ->
                                card.description = "Default done description"
                                card.dutyDate = LocalDateTime.now().plusDays(22)
                                card.label = listOf(Label().also { label -> label.name = "Improvement" })
                                card.status = Status.PENDING
                                card.responsible = User().also { user ->
                                    user.name = "System"
                                    user.age = 99
                                    user.login = "System"
                                    user.company = Company().also { company ->
                                        company.name = "Facebook"
                                    }
                                }

                            })
                        }
                )
            }

}
