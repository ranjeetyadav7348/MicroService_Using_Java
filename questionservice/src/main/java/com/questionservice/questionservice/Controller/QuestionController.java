package com.questionservice.questionservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionservice.questionservice.Entities.Question;
import com.questionservice.questionservice.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @PostMapping
    public Question create(@RequestBody Question question)
    {
        return questionService.create(question);
    }
    @GetMapping
    public List <Question> getall()
    {
        return questionService.get();
    }

    @GetMapping("/{questionId}")
    public Question getOne(@PathVariable Long questionId)
    {
        return questionService.getOne(questionId);
    }


    // get all question using quiz id
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuiz(quizId);
    }


    
}
