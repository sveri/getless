package de.sveri.getless.form;

import java.util.List;

import de.sveri.getless.entity.Meal;
import lombok.Data;

@Data
public class AddMealForm {
	
	private List<Meal> meals;

}
