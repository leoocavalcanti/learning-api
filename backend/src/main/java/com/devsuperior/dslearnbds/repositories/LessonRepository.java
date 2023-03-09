package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
