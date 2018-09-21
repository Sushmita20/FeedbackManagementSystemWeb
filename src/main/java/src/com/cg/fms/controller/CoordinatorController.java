package src.com.cg.fms.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.IParticipantEnrollmentService;
import src.com.cg.fms.service.ITrainingMaintenanceService;
@Controller
public class CoordinatorController {
	@Autowired
	ITrainingMaintenanceService trainingProgramService;
	
	@RequestMapping("/coordinatortProgramMaintenance.obj")
	public ModelAndView trainingProgramMaintainance(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("trainingMaintainance");
		return modelAndView;
	}
	@Autowired
	IParticipantEnrollmentService participanrEnrollmentService;
	@RequestMapping("/coordinatorParticipantEnroll.obj")
	public ModelAndView participantEnrollmentForm(){
		ModelAndView modelAndView = new ModelAndView();
		ParticipantEnrollment participantEnrollment = new ParticipantEnrollment();
		ArrayList<Integer> trainingCodeList =trainingProgramService.getTrainingCodes();
		ArrayList<Integer> participantList =trainingProgramService.getParticpantList();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("participantList", participantList);
		modelAndView.addObject("participant", participantEnrollment);
		modelAndView.setViewName("participantEnrollment");
		return modelAndView;
	}
	@RequestMapping("/saveCoordinatorParticipantEnroll.obj")
	public ModelAndView enrollParticipant(@ModelAttribute("participant") @Valid ParticipantEnrollment participant, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		try {
			participanrEnrollmentService.enrollParticipant(participant);
			ArrayList<Integer> trainingCodeList =trainingProgramService.getTrainingCodes();
			ArrayList<Integer> participantList =trainingProgramService.getParticpantList();
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("participantList", participantList);
			modelAndView.addObject("msg", "Participant Added Successfully.");
			modelAndView.setViewName("participantEnrollment");
			return modelAndView;
		} catch (Exception e) {
			ArrayList<Integer> trainingCodeList =trainingProgramService.getTrainingCodes();
			ArrayList<Integer> participantList =trainingProgramService.getParticpantList();
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("participantList", participantList);
			modelAndView.addObject("msg", "Participant already Enrolled for selected training.");
			modelAndView.setViewName("participantEnrollment");
			return modelAndView;
		}
	}
	@RequestMapping("/coordinatorViewFeedbackReport.obj")
	public ModelAndView viewFeedbackReport(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("coordinator",true);
		modelAndView.setViewName("feedbackReportPage");
		return modelAndView;
	}
	
}
