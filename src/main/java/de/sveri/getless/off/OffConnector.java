package de.sveri.getless.off;

import java.util.ArrayList;

import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import de.sveri.getless.entity.mongodb.Product;
import de.sveri.getless.off.entity.OffProduct;
import de.sveri.getless.off.entity.SearchResult;

@Component
public class OffConnector {

	public static class ProductList extends ArrayList<Product> {

		private static final long serialVersionUID = 1L;
	};

	@Value("${app.offf.username}")
	private String username;

	@Value("${app.offf.password}")
	private String password;

	@Value("${app.offf.url}")
	private String url;

	public SearchResult searchProduct(String searchFor) {
		String searchUrl = url + "cgi/search.pl?search_terms=" + searchFor + "&search_simple=1&json=1&page_size=1000";
		ClientResource resource = new ClientResource(searchUrl);

		resource.setChallengeResponse(ChallengeScheme.HTTP_BASIC, username, password);

		return resource.get(SearchResult.class);
	}
	
	public OffProduct byId(String id){

		String searchUrl = url + "api/v0/product/" + id + ".json";
		ClientResource resource = new ClientResource(searchUrl);

		resource.setChallengeResponse(ChallengeScheme.HTTP_BASIC, username, password);

		return resource.get(OffProduct.class);
	}

}
