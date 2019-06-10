package com.rra.project.kanbandesk.service

import com.rra.project.kanbandesk.entity.Privacy
import com.rra.project.kanbandesk.entity.Project
import com.rra.project.kanbandesk.repository.ProjectRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ProjectService(private val projectRepository: ProjectRepository,
                     private val boardService: BoardService) {

    fun createDefaultProject(project: Project) : Mono<Project>{
        var defaultProject = Project().also { project ->
            project.boards = listOf(boardService.createDefaultBoard())
            project.privacy = Privacy.PRIVATE
            project.projectName = project.projectName
        }
        return projectRepository.save(defaultProject)
    }

    fun saveProject(project: Project): Mono<Project> {
        return projectRepository.save(project)

    }

    fun findAll(): Flux<Project> {
        return projectRepository.findAll()

    }
}