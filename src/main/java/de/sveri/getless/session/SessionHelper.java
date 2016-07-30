package de.sveri.getless.session;

import javax.servlet.http.HttpSession;

public class SessionHelper {

	public static final String ADD_FOOD_WORKFLOW = "addFoodWorkflow";
	
	public static void addBreakfestWorkflowIfNull(HttpSession session){
		if(session.getAttribute(ADD_FOOD_WORKFLOW) == null){
			session.setAttribute(ADD_FOOD_WORKFLOW, new AddBreakfastWorkflow());
		}
	}
	
	public static AddBreakfastWorkflow getBreakfastWorkFlow(HttpSession session){
		if(session.getAttribute(ADD_FOOD_WORKFLOW) != null){
			return (AddBreakfastWorkflow) session.getAttribute(ADD_FOOD_WORKFLOW);
		}
		return new AddBreakfastWorkflow();
	}

}
