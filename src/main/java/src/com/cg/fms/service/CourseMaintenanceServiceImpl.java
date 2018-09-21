package src.com.cg.fms.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.ICourseDao;
import src.com.cg.fms.entities.Course;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional
public class CourseMaintenanceServiceImpl implements ICourseMaintenanceService{
	@Autowired
	ICourseDao daoImpl;

	public Course addCourse(Course courseDto) throws FeedbackException {
		courseDto = daoImpl.addCourse(courseDto);
		return courseDto;
	}

	
	public ArrayList<Course> viewAllCourses() throws FeedbackException {
		ArrayList<Course> courseList = daoImpl.viewAllCourses();
		return courseList;	}

	
	public Course viewCourseById(Integer courseId) throws FeedbackException {
		Course courseDto=daoImpl.viewCourseById(courseId);
		return courseDto;
	}

	
	public Course updateCourserDetails( Course courseDto)
			throws FeedbackException {
		return daoImpl.updateCourserDetails(courseDto);
	}

	
	public Course deleteCourseDetails(Integer cID) throws FeedbackException {
		return daoImpl.deleteCourseDetails(cID);
	}

	
	public ArrayList<Integer> getCourseIds() throws FeedbackException {
		
		return daoImpl.getCourseIds();
	}
}
