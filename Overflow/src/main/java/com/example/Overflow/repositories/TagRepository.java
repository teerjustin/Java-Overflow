package com.example.Overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Overflow.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	List<Tag> findAll();

}
