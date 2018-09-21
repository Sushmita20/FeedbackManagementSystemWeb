package src.com.cg.fms.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.IFeedbackDao;
import src.com.cg.fms.entities.Feedback;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional
public class FeedbackServiceImpl implements IFeedbackService {
	@Autowired
	IFeedbackDao feedbackDao;
	
	public void addFeedback(Feedback feedback) throws FeedbackException {
		feedbackDao.addFeedback(feedback);
	}
	
	public ArrayList<Feedback> showAllFeedback() throws FeedbackException {
		
		return feedbackDao.showAllFeedback();
	}
	
	public ArrayList<Feedback> showDefaulterList() throws FeedbackException {
		return feedbackDao.showDefaulterList();
	}
	
	public ArrayList<Feedback> showFeedbackByFacultyCode(
			TrainingProgram trainingProgram) throws FeedbackException {
		return feedbackDao.showFeedbackByFacultyCode(trainingProgram);
	}
	
	public ArrayList<Integer> getTrainingCodes(Integer Id) throws FeedbackException{
		return feedbackDao.getTrainingCodes(Id);
		
	}

	
	
	
	/*
	public List<Feedback> getFeedBack(int trainingcode) throws FeedbackException {
		return feedbackDao.getFeedBack(trainingcode);
	}*/

	/*
	public ArrayList<Feedback> showFeedback() throws FeedbackException {
		ArrayList<Feedback> feedbackList=null;
		feedbackList=feedbackDao.showFeedback();
		return feedbackList;
	
	}*/

	/*
	public List<Feedback> getFeedBackByDate(String feedbackdate) throws FeedbackException {
		return feedbackDao.getFeedBackByDate(feedbackdate);
		
	}
*/
	
	/*
	public List<Float> getAverages(List<Feedback> feedBackListById)
			throws FeedbackException {
		List<Float> averageList= new ArrayList<Float>();
		float fbClrfyDbts = 0,fbHndOut=0;
		float fbHwSwNtwrk=0;
		float fbPrsComm=0,fbTm=0;int count=0;
		for (Feedback feedback : feedBackListById) {
			fbClrfyDbts+=feedback.getFbClrfyDbts();
			fbHndOut += feedback.getFbHndOut();
			fbHwSwNtwrk+= feedback.getFbHwSwNtwrk();
			fbPrsComm+=feedback.getFbPrsComm();
			fbTm+=feedback.getFbTm();
			count++;
		}
		averageList.add((fbClrfyDbts/count));
		averageList.add((fbHndOut/count));
		averageList.add((fbHwSwNtwrk/count));
		averageList.add((fbPrsComm/count));
		averageList.add((fbTm/count));
		
		return averageList;
	}*/
	


}
