package com.react.sample.service;

import com.react.sample.model.Employee;
import reactor.core.publisher.Mono;

public interface IEmployeeService {

    void create(Employee e);

    Mono<Employee> findById(Integer id);


}
