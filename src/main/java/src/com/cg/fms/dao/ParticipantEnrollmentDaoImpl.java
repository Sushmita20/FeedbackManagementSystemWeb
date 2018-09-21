package src.com.cg.fms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.exception.FeedbackException;

@Repository
public class ParticipantEnrollmentDaoImpl implements IParticipantEnrollmentDao {
	
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	
	@PersistenceContext
	EntityManager entityManager;

	public ParticipantEnrollment enrollParticipant(ParticipantEnrollment participantEnrollment)throws FeedbackException {
		try {
			entityManager.persist(participantEnrollment);
			LOGGER.info("Participant Enrolled");
		} catch (Exception e) {
			LOGGER.error("Error in participant enrollment");
			throw new FeedbackException("Participant already Enrolled for selected training.");
		}
		return participantEnrollment;
	}

}
