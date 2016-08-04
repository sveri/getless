package de.sveri.getless.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.sveri.getless.entity.Meal;
import de.sveri.getless.off.OffConnector;
import de.sveri.getless.off.entity.Product;
import de.sveri.getless.session.AddFoodWorkflow;
import de.sveri.getless.session.SessionHelper;

@Controller
public class Diary {

	@Autowired
	OffConnector offConnector;

	@RequestMapping(value = "/diary/diet")
	public String dietDiary() {
		return "diary/diet";
	}

	@RequestMapping(value = "/diary/diet/add/{type}")
	public String addDiary(@PathVariable String type, Model model, HttpSession session) {
		switch (type) {
		case "breakfast":
			model.addAttribute("type", "Frühstück");
			break;

		default:
			break;
		}

		AddFoodWorkflow breakfastWorkFlow = SessionHelper.getBreakfastWorkFlow(session);
		model.addAttribute("products", breakfastWorkFlow.getProducts());
		
		return "diary/add";
	}

	@RequestMapping(value = "/diary/diet/meal/add", method = RequestMethod.POST)
	public String saveDiary(HttpSession session) {
		AddFoodWorkflow workFlow = SessionHelper.getBreakfastWorkFlow(session);
		
		Meal meal = new Meal();
//		meal.setAmount(100);

		return "redirect:/diary/diet/add/" + workFlow.getMealType().toString();
	}

	@RequestMapping(value = "/diary/diet/product/add/{id}")
	public String addProduct(@PathVariable String id, Model model, HttpSession session) {
		SessionHelper.addBreakfestWorkflowIfNull(session);
		Product product = offConnector.byId(id).getProduct();
		((AddFoodWorkflow) session.getAttribute(SessionHelper.ADD_FOOD_WORKFLOW)).addProduct(product);

		AddFoodWorkflow breakfastWorkFlow = SessionHelper.getBreakfastWorkFlow(session);

		return "redirect:/diary/diet/add/" + breakfastWorkFlow.getMealType().toString();
	}
}
