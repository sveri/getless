package de.sveri.getless.session;

import javax.servlet.http.HttpSession;

import de.sveri.getless.entity.MealFactory;
import de.sveri.getless.form.MealForm;

public class SessionHelper {

	public static final String ADD_FOOD_WORKFLOW = "addFoodWorkflow";
	
	public static MealForm getMeal(HttpSession session){
		if(session.getAttribute(ADD_FOOD_WORKFLOW) == null){
			return MealFactory.defaultMealForm();
		} else {
			return (MealForm) session.getAttribute(ADD_FOOD_WORKFLOW);
		}
	}
	
//	public static void addFoodWorkflowIfNull(HttpSession session){
//		if(session.getAttribute(ADD_FOOD_WORKFLOW) == null){
//			session.setAttribute(ADD_FOOD_WORKFLOW, new AddBreakfastForm());
//		}
//	}
//	
//	public static AddBreakfastForm getFoodWorkflow (HttpSession session){
//		if(session.getAttribute(ADD_FOOD_WORKFLOW) != null){
//			return (AddBreakfastForm) session.getAttribute(ADD_FOOD_WORKFLOW);
//		}
//		return new AddBreakfastForm();
//	}

}
