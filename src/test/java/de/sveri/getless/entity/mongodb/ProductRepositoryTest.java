package de.sveri.getless.entity.mongodb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.sveri.getless.Application;



//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
//@WebIntegrationTest(value = "server.port=9099")
//public class ProductRepositoryTest {
//	
//	@Autowired
//	ProductRepository productRepository;
//	
//	@Test
//	public void findFirstProduct() throws Exception {
//		Product product = productRepository.findOne("00000000000");	
//		assertEquals("2013-09-09", product.getLastEditDatesTags().get(0));
//	}
//	
//	@Test
//	public void findByName() throws Exception {
//		List<Product> products = productRepository.findByNameLike("Filet");
//		assertTrue(products.size() > 0);
//	}
//
//}
