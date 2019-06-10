package com.rra.project.kanbandesk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.rra.project.kanbandesk.entity"])
@EnableReactiveMongoRepositories(basePackages = ["com.rra.project.kanbandesk.repository"])
@Configuration
class KanbanDeskApplication

fun main(args: Array<String>) {
    runApplication<KanbanDeskApplication>(*args)
}
