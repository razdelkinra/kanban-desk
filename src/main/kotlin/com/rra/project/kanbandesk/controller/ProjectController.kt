package com.rra.project.kanbandesk.controller

import com.rra.project.kanbandesk.entity.Privacy
import com.rra.project.kanbandesk.entity.Project
import com.rra.project.kanbandesk.service.BoardService
import com.rra.project.kanbandesk.service.ProjectService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping(path = ["project"])
class ProjectController(private val projectService: ProjectService,
                        private val boardService: BoardService) {

    @PostMapping(path = ["save"])
    fun save(@RequestBody project: Project): Mono<Project> {
        return projectService.saveProject(project)
    }

    @GetMapping(path = ["savedefault"])
    fun saveDefault(): Mono<Project> {
        var project = Project().also {
            project ->
            project.projectName = "PIL"
            project.privacy = Privacy.PRIVATE
            project.boards = listOf(boardService.createDefaultBoard())
        }
        return projectService.createDefaultProject(project)
    }

    @GetMapping(path = ["all"])
    fun all(@RequestBody project: Project): Flux<Project> {
        return projectService.findAll()
    }
}