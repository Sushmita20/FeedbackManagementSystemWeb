package src.com.cg.fms.dao;

import java.util.ArrayList;

import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;

public interface IFeedbackDao {

	public void addFeedback(Feedback feedback) throws FeedbackException;
	public ArrayList<Feedback> showAllFeedback() throws FeedbackException;
	public ArrayList<Feedback> showDefaulterList() throws FeedbackException;
	public ArrayList<Feedback> showFeedbackByFacultyCode(TrainingProgram trainingProgram) throws FeedbackException;
	public ArrayList<Integer> getTrainingCodes(Integer id);
}
