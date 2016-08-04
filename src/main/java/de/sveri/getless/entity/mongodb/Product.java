package de.sveri.getless.entity.mongodb;

import java.util.List;

import lombok.Data;


@Data
//@Document(collection = "products")
public class Product {
	
//	@Id
	private String id;
	
//	@Field(value = "product_name")
	private String name;
	
//	@Field(value = "last_edit_dates_tags")
	private List<String> lastEditDatesTags;
	
	
	
}
