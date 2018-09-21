package src.com.cg.fms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.ConstraintViolationException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
@Repository
public class TrainingProgramDaoImpl implements ITrainingProgramDao {
	
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	
	@PersistenceContext
	EntityManager entityManager;
	public TrainingProgram addTrainingProgram(TrainingProgram program) throws FeedbackException {
		try {
			entityManager.persist(program);
			LOGGER.info("Training Program added.");
			return program;
		} catch (ConstraintViolationException e) {
			LOGGER.error("ConstraintViolationException");
			throw new FeedbackException("Training End Date must be greater than training Start Date");
		}
	}

	public ArrayList<TrainingProgram> viewAllTrainingProgram()
			throws FeedbackException {
		
		ArrayList<TrainingProgram> trainingDetails;
		TypedQuery< TrainingProgram> query = entityManager.createQuery("SELECT tp from TrainingProgram tp", TrainingProgram.class);
		trainingDetails =(ArrayList<TrainingProgram>) query.getResultList();
		LOGGER.info("Displaying Training Details");
		return trainingDetails;
	}

	public TrainingProgram viewTrainingProgramById(int trainingCode)
			throws FeedbackException {
		TrainingProgram trainingProgram = entityManager.find(TrainingProgram.class, trainingCode);
		LOGGER.info("Training Program Details By Training Code");
		if(trainingProgram == null){
			LOGGER.error("Error in displaying training program by id");
			throw new FeedbackException("No Training course available with above id");
		
		}
		return trainingProgram;
	}

	public TrainingProgram deleteTrainingProgram(TrainingProgram program)
			throws FeedbackException {
		TrainingProgram trainingProgram = entityManager.find(TrainingProgram.class, program.getTrainingCode());
		LOGGER.info("Deleting Training Program");
		if(trainingProgram == null){
			LOGGER.error("Error in Deleting Training Program");
			throw new FeedbackException("Training Program with above training code not available.");
		}
		entityManager.remove(trainingProgram);
		return trainingProgram;
	}

	public TrainingProgram updateTrainingProgram(TrainingProgram program)
			throws FeedbackException {
		TrainingProgram trainingProgram = entityManager.find(TrainingProgram.class, program.getTrainingCode());
		LOGGER.info("Updating Training Program Details");
		if(trainingProgram == null){
			LOGGER.error("Error in Updating Training Program Details");
			throw new FeedbackException("Training program with above training code is not available.");
		}
		trainingProgram.setCourseCode(program.getCourseCode());
		trainingProgram.setEndDate(program.getEndDate());
		trainingProgram.setStartDate(program.getStartDate());
		trainingProgram.setFacultyCode(program.getFacultyCode());
		entityManager.merge(trainingProgram);
		return trainingProgram;
	}

	public ArrayList<Integer> getTrainingCodes() {
		TypedQuery<Integer> query = entityManager.createQuery("SELECT tp.trainingCode from TrainingProgram tp ", Integer.class);
		ArrayList<Integer> trainingCodeList = (ArrayList<Integer>) query.getResultList();
		return trainingCodeList;
	}

	public ArrayList<Integer> getParticpantList() {
		TypedQuery<Integer> query = entityManager.createQuery("SELECT emp.employeeId from Employee emp where role='participant'", Integer.class);
		ArrayList<Integer> participantList = (ArrayList<Integer>) query.getResultList();
		return participantList;
	}

	public ArrayList<Integer> getFacultyCodeList() {
		ArrayList<Integer> facultyCodeList;
		TypedQuery< Integer> query = entityManager.createQuery("SELECT e.employeeId from Employee e where e.role= ?", Integer.class);
		query.setParameter(1, "coordinator");
		facultyCodeList =(ArrayList<Integer>) query.getResultList();
		return facultyCodeList;
	}


	

}
