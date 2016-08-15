package de.sveri.getless.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.sveri.getless.entity.GLProduct;
import de.sveri.getless.entity.GLProductFactory;
import de.sveri.getless.entity.Meal;
import de.sveri.getless.form.MealForm;
import de.sveri.getless.form.ProductForm;
import de.sveri.getless.form.ProductFormFactory;
import de.sveri.getless.off.OffConnector;
import de.sveri.getless.off.entity.OffProduct;
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
		Meal createMeal = SessionHelper.getMeal(session);
//		if(createMeal == nullswitch (type) {
//		case "BREAKFEST":
//			model.addAttribute("type", "Frühstück");
//			createMeal = MealFactory.createMeal(MealType.BREAKFEST);
//			break;
//
//		default:
//			break;
//		}

//		AddFoodWorkflow breakfastWorkFlow = SessionHelper.getBreakfastWorkFlow(session);
//		model.addAttribute("products", breakfastWorkFlow.getProducts());
		model.addAttribute("meal", createMeal);
		
		session.setAttribute(SessionHelper.ADD_FOOD_WORKFLOW, createMeal);
		
		return "diary/add";
	}

	@RequestMapping(value = "/diary/diet/meal/add", method = RequestMethod.POST)
	public String saveDiary(MealForm form, HttpSession session) {
//		AddFoodWorkflow workFlow = SessionHelper.getFoodWorkflow(session);
		
		Meal meal = new Meal();
//		meal.setAmount(100);

		return "redirect:/diary/diet/add/BREAKFAST";
//		return "redirect:/diary/diet/add/" + workFlow.getMealType().toString();
	}

	@RequestMapping(value = "/diary/diet/product/add/{id}")
	public String addProduct(@PathVariable String id, Model model, HttpSession session) {
		
//		Meal meal = null;
//		if(session.getAttribute(SessionHelper.ADD_FOOD_WORKFLOW) == null){
//			Meal defaultMeal = MealFactory.defaultMeal();
//			session.setAttribute(SessionHelper.ADD_FOOD_WORKFLOW, defaultMeal);
//			meal = defaultMeal;
//		} else {
//			meal = (Meal) session.getAttribute(SessionHelper.ADD_FOOD_WORKFLOW);
//		}
		MealForm meal = SessionHelper.getMeal(session);
		
		GLProduct glProduct = GLProductFactory.byId(id);
		OffProduct offProduct = offConnector.byId(id);
		
		
		
		ProductForm pf = ProductFormFactory.defaultProductForm();
		pf.setProduct(offProduct.getProduct());
		meal.getProducts().add(glProduct);
		meal.getFormProducts().add(pf);
		
//		SessionHelper.addFoodWorkflowIfNull(session);
//		Product product = offConnector.byId(id).getProduct();
//		((AddFoodWorkflow) session.getAttribute(SessionHelper.ADD_FOOD_WORKFLOW)).addProduct(product);
//
//		AddFoodWorkflow breakfastWorkFlow = SessionHelper.getFoodWorkflow(session);

		return "redirect:/diary/diet/add/" + meal.getMealType().toString();
	}
}
