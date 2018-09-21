package src.com.cg.fms.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.ICourseMaintenanceService;
import src.com.cg.fms.service.ITrainingMaintenanceService;

@Controller
public class TrainingMaintenanceController {
	
	@Autowired
	ITrainingMaintenanceService trainingProgramService;
	@Autowired
	ICourseMaintenanceService courseService;
	@RequestMapping("/trainingenterTrainingDetails.obj")
	public ModelAndView enterTrainingProgram() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		TrainingProgram trainingProgram = new TrainingProgram();
		ArrayList<Integer> courseIdList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList", courseIdList);
		System.out.println(courseIdList);
		ArrayList< Integer > facultyCodeList = trainingProgramService.getFacultyCodeList();
		modelAndView.addObject("facultyCodeList", facultyCodeList);
		System.out.println(facultyCodeList);
		modelAndView.addObject("trainingProgram", trainingProgram);
		modelAndView.setViewName("enterTrainingDetails");
		return modelAndView;
	}
	
	@RequestMapping("/trainingsaveTrainingDetails.obj")
	public ModelAndView saveTrainingProgram(@ModelAttribute("trainingProgram") @Valid TrainingProgram trainingProgram, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Integer> courseIdList;
		ArrayList< Integer > facultyCodeList;
		try {
			trainingProgramService.addTrainingProgram(trainingProgram);
			courseIdList = courseService.getCourseIds();
			modelAndView.addObject("courseIdList", courseIdList);
			facultyCodeList = trainingProgramService.getFacultyCodeList();
			modelAndView.addObject("facultyCodeList", facultyCodeList);
			modelAndView.addObject("trainingProgram", trainingProgram);
			modelAndView.setViewName("enterTrainingDetails");
			modelAndView.addObject("message", "Details added Successfully");
			return modelAndView;
		} catch (Exception e) {
			
			courseIdList = courseService.getCourseIds();
			modelAndView.addObject("courseIdList", courseIdList);
			facultyCodeList = trainingProgramService.getFacultyCodeList();
			modelAndView.addObject("facultyCodeList", facultyCodeList);
			modelAndView.addObject("trainingProgram", trainingProgram);
			modelAndView.setViewName("enterTrainingDetails");
			modelAndView.addObject("message", "Training End Date must be greater than training Start Date");
			System.out.println(e.getMessage());
			return modelAndView;
			
			
		}
	}
	
	@RequestMapping("/trainingshowTrainingDetails.obj")
	public ModelAndView viewAllTrainingProgram() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<TrainingProgram> trainingDetailsList = trainingProgramService.viewAllTrainingProgram();
		modelAndView.addObject("trainingDetailsList", trainingDetailsList);
		modelAndView.setViewName("showAllTrainingDetails");
		return modelAndView;
	}
	
	@RequestMapping("/trainingenterTrainingDetailsId.obj")
	public ModelAndView enterIdForTrainingDetail(){
		ModelAndView modelAndView = new ModelAndView();
		TrainingProgram trainingProgram = new TrainingProgram();
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("training", trainingProgram);
		modelAndView.setViewName("enterTrainingDetailsId");
		return modelAndView;
	}
	
	@RequestMapping("/trainingviewTrainingDetailsId.obj")
	public ModelAndView viewTrainingProgramById(@ModelAttribute("training") @Valid TrainingProgram trainingProgram, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		trainingProgram= trainingProgramService.viewTrainingProgramById(trainingProgram.getTrainingCode());
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("training", trainingProgram);
		modelAndView.addObject("flag", true);
		modelAndView.setViewName("enterTrainingDetailsId");
		return modelAndView;
	}
	@RequestMapping("/trainingenterTrainingUpdateDetails.obj")
	public ModelAndView enterIdForUpdate() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		TrainingProgram trainingProgram = new TrainingProgram();
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("trainingProgram", trainingProgram);
		modelAndView.setViewName("updateTrainingDetails");
		return modelAndView;
	}
	@RequestMapping("/trainingenterTrainingUpdateForm.obj")
	public ModelAndView enterUpdateDetails(@ModelAttribute("trainingProgram") @Valid TrainingProgram trainingProgram, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		ArrayList<Integer> courseIdList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList", courseIdList);
		System.out.println(courseIdList);
		ArrayList< Integer > facultyCodeList = trainingProgramService.getFacultyCodeList();
		modelAndView.addObject("facultyCodeList", facultyCodeList);
		System.out.println(facultyCodeList);
		modelAndView.addObject("flag", true);
		modelAndView.addObject("trainingCode", trainingProgram.getTrainingCode());
		modelAndView.addObject("trainingProgram", trainingProgram);
		modelAndView.setViewName("updateTrainingDetails");
		return modelAndView;
	}
	
	@RequestMapping("/trainingsaveTrainigUpdateDetails.obj")
	public ModelAndView saveTrainingUpdateDetails(@ModelAttribute("trainingProgram") @Valid TrainingProgram trainingProgram, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			
			trainingProgram= trainingProgramService.updateTrainingProgram(trainingProgram);
			ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("trainingProgram", trainingProgram);
			modelAndView.addObject("successMessage", "Training Details Updated!");
			modelAndView.setViewName("updateTrainingDetails");
			return modelAndView;
		} catch (Exception e) {
			
			ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
			modelAndView.addObject("trainingCodeList", trainingCodeList);
			modelAndView.addObject("trainingProgram", trainingProgram);
			modelAndView.addObject("successMessage", "Training End Date must be greater than training Start Date");
			modelAndView.setViewName("updateTrainingDetails");
			return modelAndView;
			
		}
	}
	
	@RequestMapping("/trainingenterTrainingDeleteDetails.obj")
	public ModelAndView enterIdForDelete(){
		ModelAndView modelAndView = new ModelAndView();
		TrainingProgram trainingProgram = new TrainingProgram();
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("trainingProgram", trainingProgram);
		modelAndView.setViewName("enterDeleteTrainingDetails");
		return modelAndView;
	}
	
	@RequestMapping("/trainingsaveTrainingDeleteDetails.obj")
	public ModelAndView saveTrainingDeleteDetails(@ModelAttribute("trainingProgram") @Valid TrainingProgram trainingProgram, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		trainingProgram = trainingProgramService.deleteTrainingProgram(trainingProgram);
		ArrayList<Integer> trainingCodeList = trainingProgramService.getTrainingCodes();
		modelAndView.addObject("trainingCodeList", trainingCodeList);
		modelAndView.addObject("trainingProgram", trainingProgram);
		modelAndView.setViewName("enterDeleteTrainingDetails");
		modelAndView.addObject("successMessage", "Training Program Deleted successfully");
		return modelAndView;
	}
}
