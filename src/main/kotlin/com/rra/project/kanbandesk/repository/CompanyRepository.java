package com.rra.project.kanbandesk.repository;

import com.rra.project.kanbandesk.entity.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends ReactiveMongoRepository<Company, Long> {
}
