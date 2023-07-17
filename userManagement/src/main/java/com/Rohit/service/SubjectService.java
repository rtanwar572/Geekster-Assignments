package com.Rohit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rohit.bean.Subject;
import com.Rohit.repository.SubjectRepository;

import jakarta.validation.Valid;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(@Valid String id, Subject subject) {
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);

    }

    public Optional<Subject>  getSubject(String id, Subject subject) {
        Optional<Subject> findById = subjectRepository.findById(id);

        return findById;

    }

}
