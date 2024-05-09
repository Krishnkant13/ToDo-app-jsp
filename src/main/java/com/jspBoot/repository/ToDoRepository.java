package com.jspBoot.repository;

import com.jspBoot.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

    @Override
    Optional<ToDo> findById(Long id);
}
