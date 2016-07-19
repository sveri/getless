package de.sveri.getless.entity.mongodb;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;


@Data
@Document(collection = "products")
public class Product {
	
	@Id
	private String id;
	
	@Field(value = "product_name")
	private String name;
	
	@Field(value = "last_edit_dates_tags")
	private List<String> lastEditDatesTags;
	
	
	
}
