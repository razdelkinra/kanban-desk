package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Card;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends ReactiveMongoRepository<Card, String> {
}
