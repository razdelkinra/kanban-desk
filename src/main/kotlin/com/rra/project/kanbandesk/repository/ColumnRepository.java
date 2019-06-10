package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Column;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ColumnRepository extends ReactiveMongoRepository<Column, String> {
}
