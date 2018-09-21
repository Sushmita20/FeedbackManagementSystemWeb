package src.com.cg.fms.service;

import java.util.ArrayList;

import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;

public interface IFeedbackService {

	public void addFeedback(Feedback feedback) throws FeedbackException;
	public ArrayList<Feedback> showAllFeedback() throws FeedbackException;
	public ArrayList<Feedback> showDefaulterList() throws FeedbackException;
	public ArrayList<Feedback> showFeedbackByFacultyCode(TrainingProgram trainingProgram) throws FeedbackException;
	/*public List<ParticipantEnrollment> fetchTrainingCode(int participantId)throws FeedbackException;
	public List<Float> getAverages(List<Feedback> feedBackListById) throws FeedbackException;
	public List<Feedback> getFeedBack(int trainingcode) throws FeedbackException;
	public List<Feedback> getFeedBackByDate(String feedbackdate) throws FeedbackException;*/
	public ArrayList<Integer> getTrainingCodes(Integer Id) throws FeedbackException;
}
