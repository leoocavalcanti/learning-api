package com.devsuperior.dslearnbds.controllers;

import com.devsuperior.dslearnbds.dto.UserDTO;
import com.devsuperior.dslearnbds.models.User;
import com.devsuperior.dslearnbds.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){

        UserDTO user = service.findById(id);
        return ResponseEntity.ok(user);
    }

}
