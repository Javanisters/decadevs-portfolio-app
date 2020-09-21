package com.javanisters.portfolioapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository {
    Iterable<Project> findProjectsByUserId(Long id);
    Iterable<Project> findProjectsByStack(String stack);
}