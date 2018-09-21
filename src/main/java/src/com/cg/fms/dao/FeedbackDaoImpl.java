package src.com.cg.fms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
@Repository
public class FeedbackDaoImpl implements IFeedbackDao {
	
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	
	@PersistenceContext
	EntityManager entityManager;
	public void addFeedback(Feedback feedback) throws FeedbackException {
		try {
			entityManager.persist(feedback);
			LOGGER.info("Inserting Participant Feedback ");
		} catch (Exception e) {
			LOGGER.error("Error in inserting participant feedback");
			throw new FeedbackException("Participant have already given feedback for the selected training.");
		}
	}
	public ArrayList<Feedback> showAllFeedback() throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM Feedback f ", Feedback.class);
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		LOGGER.info("Displaying all feedbacks.");
		return feedbackList;
	}
	public ArrayList<Feedback> showDefaulterList() throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM Feedback f where  f.fbPrsComm = 0 or f.fbClrfyDbts=0 or f.fbTm=0 or f.fbHndOut=0 or f.fbHwSwNtwrk=0", Feedback.class);
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		TypedQuery<ParticipantEnrollment> query1 = entityManager.createQuery("select p from ParticipantEnrollment p", ParticipantEnrollment.class);
		ArrayList<ParticipantEnrollment> participantList = (ArrayList<ParticipantEnrollment>) query1.getResultList();
		TypedQuery<Feedback> query2 = entityManager.createQuery("select f from Feedback f", Feedback.class);
		ArrayList<Feedback> participantWithFeedbackList = (ArrayList<Feedback>) query2.getResultList();
		
		for(Feedback feedback : participantWithFeedbackList){
			
			participantList.remove(new ParticipantEnrollment(feedback.getTrainingCode(),feedback.getParticipantId()));
			
		}
		System.out.println(participantList);
		for (ParticipantEnrollment participant : participantList){
			Feedback feedback = new Feedback();
			feedback.setParticipantId(participant.getParticipantId());
			feedback.setTrainingCode(participant.getTrainingCode());
			feedbackList.add(feedback);
		}
		LOGGER.info("Displaying defaulters feedbacks.");
		return feedbackList;
	}
	public ArrayList<Feedback> showFeedbackByFacultyCode(
			TrainingProgram trainingProgram) throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM Feedback f where trainingCode in (select t.trainingCode from TrainingProgram t where t.facultyCode =?)", Feedback.class);
		query.setParameter(1, trainingProgram.getFacultyCode());
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		LOGGER.info("Displaying feedback by faculty code");
		return feedbackList;
	}
	public ArrayList<Integer> getTrainingCodes(Integer id) {
		TypedQuery<Integer> query = entityManager.createQuery("SELECT pe.trainingCode from ParticipantEnrollment pe WHERE pe.participantId=?", Integer.class);
		query.setParameter(1, id);
		ArrayList<Integer> trainingCodeList = (ArrayList<Integer>) query.getResultList();
		return trainingCodeList;
	}

	
	
	
	
	
	/*@Override
	public ArrayList<Feedback> getFeedBack(int trainingCode)
			throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM FEEDBACK_MASTER f where TrainingCode =?", Feedback.class);
		query.setParameter(1, trainingCode);
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		return feedbackList;
	}

	@Override
	public ArrayList<Feedback> showFeedback() throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM FEEDBACK_MASTER f ", Feedback.class);
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		return feedbackList;
	}

	@Override
	public ArrayList<Feedback> getFeedBackByDate(String feedbackdate)
			throws FeedbackException {
		return null;
	}

	@Override
	public ArrayList<Feedback> fetchTrainingCode(int participantId)
			throws FeedbackException {
		ArrayList<Feedback> feedbackList;
		TypedQuery<Feedback> query = entityManager.createQuery("SELECT f FROM FEEDBACK_MASTER f where ParticipantId =?", Feedback.class);
		feedbackList = (ArrayList<Feedback>) query.getResultList();
		return feedbackList;
	} */

}
