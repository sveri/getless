package de.sveri.getless.session;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.sveri.getless.entity.MealType;
import de.sveri.getless.off.entity.Product;
import lombok.Data;

@Component
@Scope("session")
@Data
public abstract class AddFoodWorkflow {
	
	private final List<Product> products;
	
	private final MealType mealType;
	
	public void addProduct(Product product){
		products.add(product);
	}

}
