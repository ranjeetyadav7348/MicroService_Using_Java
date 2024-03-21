package com.questionservice.questionservice.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questionservice.questionservice.Entities.Question;

public interface QuestionRepository  extends JpaRepository<Question,Long>{


    List <Question> findByQuizId(Long quizid);
    
}
