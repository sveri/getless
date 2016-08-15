package de.sveri.getless.form;

import java.util.List;

import de.sveri.getless.entity.Meal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class MealForm extends Meal{
	
	private List<ProductForm> formProducts;

}
