package com.questionservice.questionservice.Service;

import java.util.List;

import com.questionservice.questionservice.Entities.Question;

public interface QuestionService {
    
Question create( Question question);
List <Question> get();
Question getOne(Long id);

List<Question >  getQuestionsOfQuiz(Long quizId);

}
