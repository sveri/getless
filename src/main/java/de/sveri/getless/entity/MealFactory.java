package de.sveri.getless.entity;

import java.util.ArrayList;

import de.sveri.getless.form.MealForm;

public class MealFactory {
	
	public static MealForm createMeal(MealType mealType){
		MealForm meal = new MealForm();
		meal.setProducts(new ArrayList<>());
		meal.setFormProducts(new ArrayList<>());
		switch (mealType) {
		case BREAKFEST:
				meal.setMealType(MealType.BREAKFEST);
			break;

		default:
			break;
		}
		
		return meal;
	}
	
	public static MealForm defaultMealForm(){
		return MealFactory.createMeal(MealType.BREAKFEST);
	}

}
