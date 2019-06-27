package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
