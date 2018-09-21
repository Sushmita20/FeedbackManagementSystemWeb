package src.com.cg.fms.dao;

import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.exception.FeedbackException;

public interface IParticipantEnrollmentDao {
	public ParticipantEnrollment enrollParticipant(ParticipantEnrollment participantEnrollment) throws FeedbackException;
}
