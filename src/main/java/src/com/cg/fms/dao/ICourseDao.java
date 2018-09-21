package src.com.cg.fms.dao;

import java.util.ArrayList;

import src.com.cg.fms.entities.Course;
import src.com.cg.fms.exception.FeedbackException;

public interface ICourseDao {

	Course addCourse(Course courseDto) throws FeedbackException;
	ArrayList<Course> viewAllCourses()throws FeedbackException;
	Course viewCourseById(Integer courseId)  throws FeedbackException;
	public Course updateCourserDetails(Course courseDto) throws FeedbackException;
	Course deleteCourseDetails(Integer cID) throws FeedbackException;
	ArrayList<Integer> getCourseIds() throws FeedbackException;
}
