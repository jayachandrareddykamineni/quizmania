package com.ssdi.quiz;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepository;

	public void createQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		quizRepository.save(quiz);
	}
	
	public void viewQuiz() {
		// TODO Auto-generated method stub
		quizRepository.findAll();
	}

	public Quiz findById(Integer quizID) {
		// TODO Auto-generated method stub
		quizRepository.findById(quizID);
		return null;
	}

	

}
