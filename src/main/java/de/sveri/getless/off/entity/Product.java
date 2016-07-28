package de.sveri.getless.off.entity;

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

}
