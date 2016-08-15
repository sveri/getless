package de.sveri.getless.form;

import de.sveri.getless.entity.UnitType;
import de.sveri.getless.off.entity.Product;
import lombok.Data;

@Data
public class ProductForm {

	private int amount;
	
	private UnitType unitType;
	
	private Product product;

}
