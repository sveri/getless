package de.sveri.getless.off.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Product {
	
	@JsonProperty(value = "_id")
	private String id;
	
	@JsonProperty(value = "product_name")
	private String name;
	
	@JsonProperty(value = "image_small_url")
	private String imageSmallUrl;
	
	@JsonProperty(value = "image_thumb_url")
	private String imageThumbUrl;
	
	private String origins;
	
	private List<Ingredient> ingredients;
	
//	public String showIngredients() {
//		return ingredients.
//	}

}
