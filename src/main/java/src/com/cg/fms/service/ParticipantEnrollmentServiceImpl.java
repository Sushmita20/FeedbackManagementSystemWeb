package src.com.cg.fms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.IParticipantEnrollmentDao;
import src.com.cg.fms.entities.ParticipantEnrollment;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional
public class ParticipantEnrollmentServiceImpl implements
		IParticipantEnrollmentService {
	@Autowired
	IParticipantEnrollmentDao participantEnrollmentDao;
	public ParticipantEnrollment enrollParticipant(ParticipantEnrollment participantEnrollment)throws FeedbackException {
		participantEnrollmentDao.enrollParticipant(participantEnrollment);
		return participantEnrollment;
	}

}
