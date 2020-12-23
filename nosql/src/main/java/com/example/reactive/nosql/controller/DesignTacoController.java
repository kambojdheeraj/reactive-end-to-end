package com.example.reactive.nosql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactive.nosql.dto.IngredientMongo;
import com.example.reactive.nosql.repository.IngredientMongoRepository;

import reactor.core.publisher.Flux;

/*
 * DesignTacoController is used to sample out code b/w MVC and WebFlux difference
 */

@RestController
@RequestMapping(path = "/design", produces = "application/json")
@CrossOrigin(origins = "*")
public class DesignTacoController {

	
	private final IngredientMongoRepository ingredientMongoRepo;

	@Autowired
	public DesignTacoController(IngredientMongoRepository ingredientMongoRepo) {
		this.ingredientMongoRepo = ingredientMongoRepo;
	}

	@GetMapping("/recentFluxDB")
	public Flux<IngredientMongo> recentIngredientFluxEndToEnd() {
		return ingredientMongoRepo.findAll();
	}

}
