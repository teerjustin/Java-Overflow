package com.example.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Overflow.models.Question;



public interface QuestionRepository extends CrudRepository<Question, Long> {
	List<Question> findAll();

}
