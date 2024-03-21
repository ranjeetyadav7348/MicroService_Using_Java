package com.quiz.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quiz.entity.Quiz;

public interface QuizRepository extends JpaRepository <Quiz,Long> {
    
}
