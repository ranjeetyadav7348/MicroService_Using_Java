package com.quiz.quiz.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.quiz.entity.Quiz;
import com.quiz.quiz.services.QuizServices;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    private QuizServices quizServices;


    public QuizController (QuizServices quizServices)
    {
        this.quizServices= quizServices;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz)
    {

        return quizServices.add(quiz);

    }

    @GetMapping
    public List <Quiz> get()
    {
        return quizServices.get();
    }

    @GetMapping("/{quizId}")
    public Quiz get( @PathVariable Long quizId)
    {
        return quizServices.get(quizId);
    }





    
}
