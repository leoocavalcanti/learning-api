package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.models.Lesson;
import com.devsuperior.dslearnbds.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    @Autowired
    private LessonService service;
    @GetMapping("/{id}")
    public ResponseEntity<Lesson> getLesson(@PathVariable Long id){

        Lesson lesson = service.getLesson(id);
        return ResponseEntity.ok(lesson);
    }
}
