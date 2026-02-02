package com.timelog.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timelog.server.models.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
    String getValById(Long id);
}
