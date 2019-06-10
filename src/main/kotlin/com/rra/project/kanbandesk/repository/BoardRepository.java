package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Board;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends ReactiveMongoRepository<Board, String> {
}
