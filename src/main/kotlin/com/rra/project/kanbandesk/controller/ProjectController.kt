package com.rra.project.kanbandesk.controller

import com.rra.project.kanbandesk.entity.Privacy
import com.rra.project.kanbandesk.entity.Project
import com.rra.project.kanbandesk.service.BoardService
import com.rra.project.kanbandesk.service.ProjectService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["project"])
class ProjectController(private val projectService: ProjectService,
                        private val boardService: BoardService) {

    @PostMapping(path = ["save"])
    fun save(@RequestBody project: Project): Project {
        return projectService.saveProject(project)
    }

    @GetMapping(path = ["savedefault"])
    fun saveDefault(): Project {
        var project = Project().also { project ->
            project.projectName = "PIL"
            project.privacy = Privacy.PRIVATE
            project.boards = listOf(boardService.createDefaultBoard())
        }
        return projectService.createDefaultProject(project)
    }

    @GetMapping(path = ["all"])
    fun all(@RequestBody project: Project): List<Project> {
        return projectService.findAll()
    }
}