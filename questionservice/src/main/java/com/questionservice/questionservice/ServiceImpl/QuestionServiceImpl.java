package com.questionservice.questionservice.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionservice.questionservice.Entities.Question;
import com.questionservice.questionservice.Repositories.QuestionRepository;
import com.questionservice.questionservice.Service.QuestionService;

@Service
public class QuestionServiceImpl  implements QuestionService{


    @Autowired
    private QuestionRepository questionRepository;



    @Override
    public Question create(Question question) {
        // TODO Auto-generated method stub
        return questionRepository.save(question);
        
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
       
    }

    @Override
    public Question getOne(Long id) {
        // TODO Auto-generated method stub
      
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("not found the question"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        // TODO Auto-generated method stub
      return questionRepository.findByQuizId(quizId);
    }
    
}
