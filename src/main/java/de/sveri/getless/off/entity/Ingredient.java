package de.sveri.getless.off.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Ingredient {
	
	private String text;
	
	private String id;
	
	private int rank;

	@Override
	public String toString(){
		return text;
	}

}
