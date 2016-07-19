package de.sveri.getless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Diary {

	@RequestMapping(value = "/diary/diet")
	public String dietDiary(){
		return "diary/diet";
	}
}
