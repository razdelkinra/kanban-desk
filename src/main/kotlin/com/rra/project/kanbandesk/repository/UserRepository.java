package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
