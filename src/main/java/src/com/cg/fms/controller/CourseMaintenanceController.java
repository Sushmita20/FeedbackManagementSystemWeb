
package src.com.cg.fms.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.Course;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.ICourseMaintenanceService;

@Controller
public class CourseMaintenanceController {
			
	@Autowired
	ICourseMaintenanceService courseService;
	
	@RequestMapping("/courseenterCourseDetails.obj")
	public ModelAndView enterCourseDetails(){
		ModelAndView modelAndView = new ModelAndView();
		Course course = new Course();
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterCourseDetails");
		return modelAndView;
	}
	
	@RequestMapping("/coursesaveCourseDetails.obj")
	public ModelAndView saveCourseDetails(@ModelAttribute("course") @Valid Course course, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		if(!result.hasErrors()){
		course=courseService.addCourse(course);
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterCourseDetails");
		modelAndView.addObject("msg", "Your course details have been added. Your course id is "+course.getCourseId());
		}
		else{
			modelAndView.addObject("course", course);
			modelAndView.setViewName("enterCourseDetails");
		}
		return modelAndView;
	}
	
	@RequestMapping("/courseenterCourseId.obj")
	public ModelAndView enterCourseId() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		Course course = new Course();
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterCourseID");
		return modelAndView;
	}
	
	@RequestMapping("/courseviewCourseWithId.obj")
	public ModelAndView viewCourseById(@ModelAttribute("course") @Valid Course course, BindingResult result) throws FeedbackException{
		
		ModelAndView modelAndView = new ModelAndView();
		course=courseService.viewCourseById(course.getCourseId());
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.addObject("flag", "true");
		modelAndView.setViewName("enterCourseID");
		return modelAndView;
	}
	
	@RequestMapping("/courseviewCourseDetails")
	public ModelAndView ViewAllCourseDetails() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		ArrayList<Course> courseList = courseService.viewAllCourses();
		modelAndView.addObject("courseList", courseList);
		modelAndView.setViewName("viewCourseDetails");
		return modelAndView;
	}
	
	@RequestMapping("/courseenterUpdateDetails.obj")
	public ModelAndView enterIdForUpdate() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		Course course = new Course();
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterUpdateDetails");
		return modelAndView;
	}
	
	@RequestMapping("/courseViewUpdateForm.obj")
	public ModelAndView UpdateForm(@ModelAttribute("course") @Valid Course course, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courseP", new Course());
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("courseId", course.getCourseId());
		modelAndView.addObject("flag", "true");
		modelAndView.addObject("smsg", course.getCourseId());
		modelAndView.setViewName("enterUpdateDetails");
		return modelAndView;
	}
	
	@RequestMapping("/coursesaveUpdateDetails.obj")
	public ModelAndView saveUpdateDetails(@ModelAttribute("courseP") @Valid Course course, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		course = courseService.updateCourserDetails(course);
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterUpdateDetails");
		modelAndView.addObject("msg", "Your course details have been updated.");
		return modelAndView;
	}
	
	@RequestMapping("/courseenterDeleteDetails.obj")
	public ModelAndView enterIdForDelete() throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		Course course = new Course();
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.setViewName("enterDeleteDetails");
		return modelAndView;
	}
	
	@RequestMapping("/coursesaveDeleteDetails.obj")
	public ModelAndView saveDeleteDetails(@ModelAttribute("course") @Valid Course course, BindingResult result) throws FeedbackException{
		ModelAndView modelAndView = new ModelAndView();
		course = courseService.deleteCourseDetails(course.getCourseId());
		ArrayList<Integer> courseList = courseService.getCourseIds();
		modelAndView.addObject("courseIdList",courseList);
		modelAndView.addObject("course", course);
		modelAndView.addObject("msg", "Course Deleted");
		modelAndView.setViewName("enterDeleteDetails");
		return modelAndView;
	}
}
