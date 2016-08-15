package de.sveri.getless.entity;

public class GLProductFactory {
	
	public static GLProduct byId(Long id) {
		GLProduct product = new GLProduct();
		product.setId(id);
		return product;
	}
	
	public static GLProduct byId(String id) {
		Long lId = Long.parseLong(id);
		return GLProductFactory.byId(lId);
	}

}
