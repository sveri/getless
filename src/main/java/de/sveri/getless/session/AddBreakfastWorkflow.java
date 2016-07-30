package de.sveri.getless.session;

import java.util.ArrayList;
import java.util.List;

import de.sveri.getless.entity.MealType;
import de.sveri.getless.off.entity.Product;

public class AddBreakfastWorkflow extends AddFoodWorkflow {

	private AddBreakfastWorkflow(List<Product> products) {
		super(products, MealType.BREAKFEST);
	}
	
	public AddBreakfastWorkflow(){
		this(new ArrayList<>());
	}

}
