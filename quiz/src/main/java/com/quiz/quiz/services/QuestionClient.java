package com.quiz.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.quiz.entity.Question;

// @FeignClient(url = "http://localhost:8081",value = "Question-Client")
@FeignClient(name= "QUESTIONSERVICE")
public interface QuestionClient {



    @GetMapping("/question/quiz/{quizId}")
List <Question> getQuestionOfQuiz(@PathVariable Long quizId);
    
}
