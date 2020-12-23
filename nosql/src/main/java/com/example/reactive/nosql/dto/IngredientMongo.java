package com.example.reactive.nosql.dto;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class IngredientMongo {
	
	@Id
	private String id;
	private String name;
	private String type;
	
	public IngredientMongo(String id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
