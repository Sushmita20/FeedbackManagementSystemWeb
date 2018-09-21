package src.com.cg.fms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.Course;
import src.com.cg.fms.exception.FeedbackException;
@Repository
public class CourseDaoImpl implements ICourseDao {
	
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	@PersistenceContext
	EntityManager entityManager;
	public Course addCourse(Course courseDto) throws FeedbackException {
		entityManager.persist(courseDto);
		LOGGER.info("Inserting Course Details");
		if(courseDto == null){
			LOGGER.error("Sql Exception Occured.");
			throw new FeedbackException("Unable to add Course Details");}
		return courseDto;
	}

	public ArrayList<Course> viewAllCourses() throws FeedbackException {
		ArrayList<Course> courseList ;
		TypedQuery<Course> query = entityManager.createQuery("SELECT c from Course c", Course.class);
		courseList= (ArrayList<Course>) query.getResultList();
		LOGGER.info("Displaying all Courses.");
		return courseList;
	}

	public Course viewCourseById(Integer courseId) throws FeedbackException {
		Course course;
		course = entityManager.find(Course.class, courseId);
		LOGGER.info("Displaying courses by course id.");
		if(course==null){
			LOGGER.error("Error in displaying the course details");
			throw new FeedbackException("Invalid Course Id!!!");
		}
		return course;
	}

	public Course updateCourserDetails(Course courseDto) throws FeedbackException {
		Course course = entityManager.find(Course.class, courseDto.getCourseId());
		course.setCourseName(courseDto.getCourseName());
		course.setNoOfDays(courseDto.getNoOfDays());
		course = entityManager.merge(courseDto);
		LOGGER.info("Updating Courses.");
		return course;
	}

	public Course deleteCourseDetails(Integer cID) throws FeedbackException {
		Course course = entityManager.find(Course.class, cID);
		LOGGER.info("Deleting Courses.");
		if(course == null){
			LOGGER.error("Error in deleting course details");
			throw new FeedbackException("Course with above Id does not exixt.");
		}
		entityManager.remove(course);
		return course;
		
	}

	public ArrayList<Integer> getCourseIds() throws FeedbackException {
		TypedQuery<Integer> query = entityManager.createQuery("SELECT c.courseId from Course c", Integer.class);
		ArrayList<Integer> courseIdList= (ArrayList<Integer>) query.getResultList();
		return courseIdList;
	}

}
