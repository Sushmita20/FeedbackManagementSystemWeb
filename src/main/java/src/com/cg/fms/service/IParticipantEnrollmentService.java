package src.com.cg.fms.service;

import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.exception.FeedbackException;

public interface IParticipantEnrollmentService {
	public ParticipantEnrollment enrollParticipant(ParticipantEnrollment participantEnrollment) throws FeedbackException;
}
