package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {
}
