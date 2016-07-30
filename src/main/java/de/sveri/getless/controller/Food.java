package de.sveri.getless.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.sveri.getless.off.OffConnector;

@Controller
public class Food {
	
	@Autowired
	OffConnector offConnector;
	
	@RequestMapping(value = "/food/product/{id}")
	public ModelAndView foodDetail(@PathVariable String id){
		ModelAndView mav = new ModelAndView("food/detail");
		
		mav.addObject("product", offConnector.byId(id).getProduct());
		return mav;
	}
	
	@RequestMapping(value = "/food")
	public ModelAndView foodIndex(@RequestParam(name = "search-for", required = false, defaultValue = "") String searchFor){
		ModelAndView mav = new ModelAndView("food/index");
		
		if(StringUtils.isNotEmpty(searchFor)){
			mav.addObject("products", offConnector.searchProduct(searchFor).getProducts());
		}
		return mav;
	}
	
	@RequestMapping(value = "/food/pick")
	public ModelAndView pick(@RequestParam(name = "search-for", required = false, defaultValue = "") String searchFor){
		ModelAndView mav = new ModelAndView("food/index");
		
		if(StringUtils.isNotEmpty(searchFor)){
			mav.addObject("products", offConnector.searchProduct(searchFor).getProducts());
		}
		return mav;
	}

}
