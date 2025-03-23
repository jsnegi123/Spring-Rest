package com.in28minutes.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserRestRepository extends PagingAndSortingRepository<UserName, Long> {
    List<UserName> findByRole(@Param("role") String role);
}
