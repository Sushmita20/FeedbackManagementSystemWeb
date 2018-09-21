package src.com.cg.fms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.FacultySkill;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.IFacultySkillService;

@Controller

public class AdminController {

	
	@Autowired
	IFacultySkillService facultySkillSetImpl;
	@RequestMapping("/adminControllerskillMaintainance.obj")
	public ModelAndView viewFacultySkillSet() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<FacultySkill> facultySkillList = facultySkillSetImpl.showFacultySkillSet();
		modelAndView.addObject("facultySkillList", facultySkillList);
		modelAndView.setViewName("facultySkillSet");
		return modelAndView;
	}
	
	@RequestMapping("/adminControllercourseMaintainance.obj")
	public ModelAndView courseMaintainance(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("courseMaintainancePage");
		return modelAndView;
		
	}
	
	@RequestMapping("/adminControllerviewFeedbackReport.obj")
	public ModelAndView viewFeedbackReport(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("admin",true);
		modelAndView.setViewName("feedbackReportPage");
		return modelAndView;
	}
	
	
}
