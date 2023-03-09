package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.models.Lesson;
import com.devsuperior.dslearnbds.repositories.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class LessonService {

    @Autowired
    private LessonRepository repository;

    public Lesson getLesson(Long id){

        Lesson lesson = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return lesson;
    }
}
