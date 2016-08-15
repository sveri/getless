package de.sveri.getless.form;

import de.sveri.getless.entity.UnitType;

public class ProductFormFactory {
	
	public static ProductForm defaultProductForm(){
		ProductForm pf = new ProductForm();
		pf.setUnitType(UnitType.GRAM);
		return pf;
	}

}
