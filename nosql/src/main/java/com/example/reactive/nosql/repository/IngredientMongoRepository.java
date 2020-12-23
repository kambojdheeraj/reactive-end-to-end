package com.example.reactive.nosql.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.reactive.nosql.dto.IngredientMongo;

@CrossOrigin(origins="*")
public interface IngredientMongoRepository extends ReactiveCrudRepository<IngredientMongo, String> {
	
	
}
