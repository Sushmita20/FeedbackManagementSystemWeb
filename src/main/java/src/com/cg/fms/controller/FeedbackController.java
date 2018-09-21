package src.com.cg.fms.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.IFeedbackService;
import src.com.cg.fms.service.ITrainingMaintenanceService;

@Controller
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService;
	@Autowired
	ITrainingMaintenanceService trainingProgramService;
	@RequestMapping("/feedbackviewAllFeedback.obj")
	public ModelAndView viewAllFeedback() throws FeedbackException{
		ArrayList< Feedback > feedbackList = feedbackService.showAllFeedback();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("feedbackList", feedbackList);
		System.out.println(feedbackList);
		modelAndView.setViewName("allFeedback");
		return modelAndView;
	}
	
	@RequestMapping("/feedbackenterFeedbackByFaculty.obj")
	public ModelAndView enterIdForFacultyFeedback(){
		ModelAndView modelAndView = new ModelAndView();
		TrainingProgram trainingProgram = new TrainingProgram();
		modelAndView.addObject("training", trainingProgram);
		modelAndView.setViewName("enterFeedbackByFaculty");
		ArrayList< Integer> facultyCodes = trainingProgramService.getFacultyCodeList();
		modelAndView.addObject("facultyCodeList", facultyCodes);
		return modelAndView;
		
	}
	
	@RequestMapping("/feedbackviewFeedbackByFacultyId.obj")
	public ModelAndView viewFeedbackByFacultyId(@ModelAttribute("training") @Valid TrainingProgram trainingProgram, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("viewFeedbackByFacultyId");
		ArrayList<Feedback> feedbackList = feedbackService.showFeedbackByFacultyCode(trainingProgram);
		modelAndView.addObject("feedbackList", feedbackList);
		return modelAndView;
		
	}
	
	@RequestMapping("/feedbackdefaulterList.obj")
	public ModelAndView viewDefaulterList() throws FeedbackException{
		ArrayList< Feedback > feedbackList = feedbackService.showDefaulterList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("feedbackList", feedbackList);
		System.out.println(feedbackList);
		modelAndView.setViewName("defaultersFeedback");
		return modelAndView;
	}
	
}
