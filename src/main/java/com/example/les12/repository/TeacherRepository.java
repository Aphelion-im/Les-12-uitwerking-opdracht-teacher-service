package com.example.les12.repository;

import com.example.les12.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    // Iterable<Teacher> findByDobBefore(LocalDate date);
    // List<Teacher> findByDobAfter(LocalDate date);
    boolean existsByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);
}
