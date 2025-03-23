package com.in28minutes.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserName, Long> {
    List<UserName> findByRole(String role);
}
