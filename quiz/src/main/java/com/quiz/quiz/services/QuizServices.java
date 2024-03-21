package com.quiz.quiz.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.quiz.quiz.entity.Quiz;



public interface QuizServices {


    Quiz add(Quiz quiz);

    List < Quiz> get();

    Quiz get(Long id);
    
}
