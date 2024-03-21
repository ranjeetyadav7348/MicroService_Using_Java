package com.quiz.quiz.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quiz.quiz.entity.Quiz;
import com.quiz.quiz.repositories.QuizRepository;
import com.quiz.quiz.services.QuestionClient;
import com.quiz.quiz.services.QuizServices;


@Component
public class QuizServiceImpl  implements QuizServices{


    @Autowired
    private QuizRepository quizRepository;


    @Autowired
    private QuestionClient questionClient;


    @Override
    public Quiz add(Quiz quiz) {
        // TODO Auto-generated method stub
      return  quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        // TODO Auto-generated method stub
      List< Quiz > quizz =quizRepository.findAll();

      List <Quiz> newQuiz= quizz.stream().map( quiz-> {quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getId()));
    return quiz;
    
    }).collect(Collectors.toList());


return newQuiz;


    }

    @Override
    public Quiz get(Long id) {
        // TODO Auto-generated method stub
      Quiz quiz=quizRepository.findById(id).orElseThrow(()->  new RuntimeException("Quiz not found"));
   
     quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getId()));
   
   return quiz;
    }
    
}
