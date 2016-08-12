package de.sveri.getless.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

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
	@OneToOne
	private User user;
	
	@NotNull
	@OneToMany
	private List<GLProduct> products;

}
