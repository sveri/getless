package de.sveri.getless.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class GLProduct {
	
	@GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private Long id;
	
	@NotNull
	private String productId;
	
	@NotNull
	private int amount;
	
	@NotNull
	private UnitType unitType;

}
