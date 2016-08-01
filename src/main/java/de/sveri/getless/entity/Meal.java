package de.sveri.getless.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import de.sveri.getless.off.entity.Product;
import lombok.Data;

@Data
@Entity
public class Meal {
	
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Long id;
	
	@NotNull
	private MealType mealType;
	
	@NotNull
	private User user;
	
	@NotNull
	private Product product;
	
	@NotNull
	private int amount;
	
	@NotNull
	private UnitType unitType;

}
