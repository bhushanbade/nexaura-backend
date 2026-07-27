package com.nexaura.backend.repository;

import com.nexaura.backend.entity.Decision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DecisionRepository extends JpaRepository<Decision, Long> {
List<Decision> findByStatus(String status);
List<Decision> findByTitleContainingIgnoreCase(String title);
List<Decision> findByUserId(Long userId);
}