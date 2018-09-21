package src.com.cg.fms.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.IFeedbackService;
import src.com.cg.fms.service.ITrainingMaintenanceService;

@Controller
public class ParticipantController {
	@Autowired
	IFeedbackService feedbackService;
	@Autowired
	ITrainingMaintenanceService trainingProgramService;
	@RequestMapping("/participantenterFeedback.obj")
	public ModelAndView enterParticipantId(){
		ModelAndView modelAndView = new ModelAndView();
		Feedback feedback = new Feedback();
		modelAndView.addObject("id", true);
		modelAndView.addObject("feedback", feedback);
		modelAndView.setViewName("participantFeedback");
		return modelAndView;
	}
	@RequestMapping("/participantenterFeedbackForm.obj")
	public ModelAndView enterFeedback(@ModelAttribute("feedback") @Valid Feedback feedback, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Integer> trainingCodeList =feedbackService.getTrainingCodes(feedback.getParticipantId());
		modelAndView.addObject("form", true);
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("feedback", feedback);
		modelAndView.setViewName("participantFeedback");
		return modelAndView;
	}
	@RequestMapping("participantSaveFeedback.obj")
	public ModelAndView saveFeedback(@ModelAttribute("feedback") @Valid Feedback feedback, BindingResult result) throws FeedbackException {
		ModelAndView modelAndView = new ModelAndView();
		try {
			if(!result.hasErrors()){
				
				DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				feedback.setFeedbackDate(dateFormat.format(date).toString());
				feedbackService.addFeedback(feedback);
				modelAndView.addObject("flag", true);
				modelAndView.setViewName("participantFeedback");
				return modelAndView;
			}
			ArrayList<Integer> trainingCodeList =feedbackService.getTrainingCodes(feedback.getParticipantId());
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("feedback", feedback);
			modelAndView.addObject("form", true);
			modelAndView.setViewName("participantFeedback");
			return modelAndView;
		} catch (Exception e) {
			ArrayList<Integer> trainingCodeList =feedbackService.getTrainingCodes(feedback.getParticipantId());
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("feedback", feedback);
			modelAndView.addObject("form", true);
			modelAndView.addObject("message","Participant have already given feedback for the selected training.");
			modelAndView.setViewName("participantFeedback");
			return modelAndView;
			
			
		}
	}
}
