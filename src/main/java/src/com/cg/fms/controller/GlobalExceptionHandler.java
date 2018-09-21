package src.com.cg.fms.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler (value={FeedbackException.class})
	protected ModelAndView handleConflict(Exception ex){
		Employee employee = new Employee();
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("employee",employee);
		model.addObject("errMessage",ex.getMessage());
		return model;
	}
}
