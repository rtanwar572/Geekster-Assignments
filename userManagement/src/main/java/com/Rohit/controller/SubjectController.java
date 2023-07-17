package com.Rohit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rohit.bean.Subject;
import com.Rohit.service.SubjectService;

import jakarta.validation.Valid;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    //Get All Users
    @GetMapping("/users")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    //Get user by userid
    @GetMapping("/user/{id}")
    public Optional<Subject> getUser(@PathVariable String id ,@RequestBody Subject subject)
    {
        return subjectService.getSubject(id,subject);
    }

    //create user
    @PostMapping("/user")
    public void addSubject(@Valid @RequestBody Subject subject)
    {
        subjectService.addSubject(subject);
    }

    //update user
    @PutMapping("/user/{id}")
    public void updateSubject(@Valid @PathVariable String id ,@RequestBody Subject subject)
    {
        subjectService.updateSubject(id,subject);
    }

    //delete user

    @DeleteMapping("/user/{id}")
    public void deleteSubject(@PathVariable String id)
    {
        subjectService.deleteSubject(id);
    }

}