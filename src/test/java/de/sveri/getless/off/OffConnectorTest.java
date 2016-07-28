package de.sveri.getless.off;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.getless.Application;
import de.sveri.getless.off.entity.SearchResult;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest
public class OffConnectorTest {
	
	@Autowired
	OffConnector offConnector;
	
	@Test
	public void searchForProduct() throws Exception {
		SearchResult searchProduct = offConnector.searchProduct("Steak");
		assertTrue(searchProduct.getProducts().size() > 200);
	}

}
