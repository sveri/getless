package de.sveri.getless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Food {
	
	@RequestMapping(value = "/food")
	public String dietDiary(){
		return "food/index";
	}

}
