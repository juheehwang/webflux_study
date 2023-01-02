package com.react.sample.dao;

import com.react.sample.model.Employee;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee,Integer> {

    @Query("{ 'name': ?0 }")
    Flux<Employee> findByNAme(final String name);
}
