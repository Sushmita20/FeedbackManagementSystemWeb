package src.com.cg.fms.service;

import java.util.ArrayList;

import src.com.cg.fms.entities.Course;
import src.com.cg.fms.exception.FeedbackException;

public interface ICourseMaintenanceService {

	public Course addCourse(Course courseDto) throws FeedbackException;
	public ArrayList<Course> viewAllCourses()throws FeedbackException;
	public Course viewCourseById(Integer courseId)  throws FeedbackException;
	public Course updateCourserDetails(Course courseDto) throws FeedbackException;
	public Course deleteCourseDetails(Integer courseId) throws FeedbackException;
	public ArrayList<Integer> getCourseIds() throws FeedbackException;
}
